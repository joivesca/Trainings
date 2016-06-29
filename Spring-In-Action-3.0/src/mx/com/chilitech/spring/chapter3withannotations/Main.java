package mx.com.chilitech.spring.chapter3withannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws PerformanceException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-chapter3-annotations.xml");
		
		Performer performer = (Performer)ctx.getBean("kenny");
		performer.perform();
	}
}
