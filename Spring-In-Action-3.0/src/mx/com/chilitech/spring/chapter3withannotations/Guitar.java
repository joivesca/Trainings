package mx.com.chilitech.spring.chapter3withannotations;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{
	public void play(){
		System.out.println("Strumstrumstrum");
	}
}