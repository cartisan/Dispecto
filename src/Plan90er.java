
public class Plan90er implements GastPartyKontext {

	public void feiere(Gast gast, Disko disko) {
		disko.trinken(gast);
		disko.trinken(gast);
		disko.tanzen(gast);
		disko.trinken(gast);
		disko.tanzen(gast);
		gast.verlasseDisko();
	}

}
