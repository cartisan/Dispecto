
public class Capo {
	private int betrunkene=0;
	
	public void meldung() {
		betrunkene += 1;
		if(betrunkene>20) {
			Autoritaet.meldung();
			betrunkene=0;
		}
	}

}
