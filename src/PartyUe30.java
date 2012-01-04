
public class PartyUe30 implements PartyKontext {

	public void tanzen(Gast gast, int haerte) {
		gast.subPegel(haerte-5);
	}

	public void trinken(Gast gast, int haerte) {
		gast.addPegel(haerte);
		gast.addAusgaben(5*haerte);
	}
	
	public String getPartyName() {
		return "Ü30-Party";
	}
	
	public GastPartyKontext getGastKontext() {
		return new PlanUe30();
	}

}
