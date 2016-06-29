package mx.com.chilitech.spring.chapter2;

import java.util.Properties;

public class OneManBand4 implements Performer {

	private Properties instruments;	
	
	public OneManBand4(){
		
	}
	
	@Override
	public void perform() throws PerformanceException {
		
	}

	public void setInstruments(Properties instruments){
		this.instruments = instruments;
	}
}
 