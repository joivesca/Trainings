package mx.com.chilitech.spring.chapter2;

import java.util.List;

public class OneManBand2 implements Performer {

	Instrument[] instruments;
	List<Instrument> instruments2;
	
	public OneManBand2(){
		
	}
	
	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments){
			instrument.play();
		}
	}

	
}
