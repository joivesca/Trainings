package mx.com.chilitech.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws PerformanceException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-chapter2.xml");
		
		Performer performer = (Performer)ctx.getBean("kenny");
		performer.perform();
	}
}
