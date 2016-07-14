package mx.com.chilitech.jms.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.BasicConfigurator;

public class DemoPublisherSubscriberModel implements MessageListener {

	private TopicSession pubSession;
	private TopicPublisher publisher;
	private TopicConnection connection;

	/* Establish JMS publisher and subscriber */
	public DemoPublisherSubscriberModel(String topicName, String username,
	   String password) throws Exception {
	  

		Properties props = new Properties();
		props.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		props.setProperty(Context.PROVIDER_URL,"tcp://localhost:61616");	
		
	  // Obtain a JNDI connection
	  Context jndi = new InitialContext(props);

	  // Look up a JMS connection factory
	  TopicConnectionFactory conFactory = (TopicConnectionFactory) jndi.lookup("TopicConnectionFactory");

	  // Create a JMS connection
	  connection = conFactory.createTopicConnection(username, password);

	  // Create JMS session objects for publisher and subscriber
	  pubSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
	  TopicSession subSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

	  // Look up a JMS topic
	  Topic chatTopic = (Topic) jndi.lookup(topicName);

	  // Create a JMS publisher and subscriber
	  publisher = pubSession.createPublisher(chatTopic);
	  TopicSubscriber subscriber = subSession.createSubscriber(chatTopic);

	  // Set a JMS message listener
	  subscriber.setMessageListener(this);

	  // Start the JMS connection; allows messages to be delivered
	  connection.start();

	  // Create and send message using topic publisher
	  TextMessage message = pubSession.createTextMessage();
	  message.setText(username + ": Howdy Friends!");
	  publisher.publish(message);

	 }

	/*
	 * A client can register a message listener with a consumer. A message
	 * listener is similar to an event listener. Whenever a message arrives at
	 * the destination, the JMS provider delivers the message by calling the
	 * listener's onMessage method, which acts on the contents of the message.
	 */
	public void onMessage(Message message) {
		try {
			TextMessage textMessage = (TextMessage) message;
			String text = textMessage.getText();
			System.out.println(text);
		} catch (JMSException jmse) {
			jmse.printStackTrace();
		}
	}

	public static void main(String[] args) {
	  BasicConfigurator.configure();
	  try {
	   if (args.length != 3)
	    System.out.println("Please Provide the topic name,username,password!");

	   DemoPublisherSubscriberModel demo = new DemoPublisherSubscriberModel(
	     //args[0], args[1], args[2]);
			"dynamicTopics/Test", "", "");   
			   
	   BufferedReader commandLine = new java.io.BufferedReader(
	     new InputStreamReader(System.in));

	   // closes the connection and exit the system when 'exit' enters in
	   // the command line
	   while (true) {
	    String s = commandLine.readLine();
	    if (s.equalsIgnoreCase("exit")) {
	     demo.connection.close();
	     System.exit(0);

	    }
	   }
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }

}
