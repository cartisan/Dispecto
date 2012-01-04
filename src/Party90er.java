
public class Party90er implements PartyKontext {

	public void tanzen(Gast gast, int haerte) {
		gast.subPegel(haerte);
	}

	public void trinken(Gast gast, int haerte) {
		gast.addPegel(2*haerte);
		gast.addAusgaben(haerte);
	}
	
	public String getPartyName() {
		return "90' Party";
	}
	
	public GastPartyKontext getGastKontext() {
		return new Plan90er();
	}

}
