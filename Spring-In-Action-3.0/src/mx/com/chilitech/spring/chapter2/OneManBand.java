package mx.com.chilitech.spring.chapter2;

import java.util.Collection;

public class OneManBand implements Performer {

	private Collection<Instrument> instruments;
	
	public OneManBand(){
		
	}
	
	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments){
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments){
		this.instruments = instruments;
	}
}
