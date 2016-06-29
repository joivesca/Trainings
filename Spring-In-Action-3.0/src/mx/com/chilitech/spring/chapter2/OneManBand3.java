package mx.com.chilitech.spring.chapter2;

import java.util.Map;

public class OneManBand3 implements Performer {

	Map<String, Instrument> instruments;	
	
	public OneManBand3(){
		
	}
	
	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()){
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String,Instrument> instruments){
		this.instruments = instruments;
	}
}
 