
public class Party�30 implements PartyKontext {

	public void tanzen(Gast gast, int haerte) {
		gast.subPegel(haerte);
	}

	public void trinken(Gast gast, int haerte) {
		gast.addPegel(2*haerte);
		gast.addAusgaben(haerte);
	}
	
	public String getPartyName() {
		return "�30-Party";
	}
	
	public GastPartyKontext getGastKontext() {
		return new Plan�30();
	}

}
