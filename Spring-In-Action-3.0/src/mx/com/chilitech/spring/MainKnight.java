package mx.com.chilitech.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainKnight {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
		
		Knight knight = (Knight) context.getBean("knight");
		
		knight.embarkOnQuest();
	}
}
