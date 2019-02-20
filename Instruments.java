package bibli;

public enum Instruments {
	VOICE(0),GUITAR(1),BASS(2),DRUMS(3),PIANO(4);
	
	private final int id;
	
	private Instruments(int i) {
		this.id=i;
	}
	public int getInstrumentsNumber() {
		return this.values().length;
	}
	
	public Instruments getInstrumentsById(int id) {
		return null;
	}
}
