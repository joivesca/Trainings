package mx.com.chilitech.spring.chapter2;

public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;
	
	public Instrumentalist(){
		
	}
	
	@Override
	public void perform() {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
	
	public void setSong(String song){
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}
	
	public Instrument getInstrument(){
		return instrument;
	}
	
}
