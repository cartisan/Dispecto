
public class Autoritaet {
	//CONC: Autorisierung
	public static boolean meldung() {
		return true;
	}
	
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
		
		Disko disko1 = new Disko("Thimbles",10,3,new Party90er());
		disko1.setCapo(new Capo());
		Disko disko2 = new Disko("Boojum",5,1,null);
		disko2.setCapo(new Capo());
		Disko disko3 = new Disko("Fork",15,7,new PartyUe30());
		disko3.setCapo(new Capo());
		
		Gast gast1 = new Gast("Bellmann",9);
		gast1.besucheDisko(disko1);
		gast1.besucheDisko(disko2);
		gast1.besucheDisko(disko3);

	}

}
