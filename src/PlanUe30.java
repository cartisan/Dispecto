
public class PlanUe30 implements GastPartyKontext {

	public void feiere(Gast gast, Disko disko) {
		disko.trinken(gast);
		disko.trinken(gast);
		disko.trinken(gast);
		disko.trinken(gast);
		disko.trinken(gast);
		gast.verlasseDisko();
	}

}