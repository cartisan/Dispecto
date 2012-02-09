	//CONC: Autorisierung
public class Authority {
	//PAT: Singleton
	private static Authority instance = null;
	public static Authority getInstance
	() {
		if (instance==null) {
			instance=new Authority();
		}
		return instance;
	}
	
	private String name;
	private Authority() {name="Vito";}

	//CONC: Authorisierung
	public boolean report() {
		return true;
	}
	
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
		Authority donCorleone = Authority.getInstance();
		
		Disco disko1 = new Disco("Thimbles",10,3,new Party90s());
		disko1.setCapo(new Capo(donCorleone));
		Disco disko2 = new Disco("Boojum",5,1,null);
		disko2.setCapo(new Capo(donCorleone));
		Disco disko3 = new Disco("Fork",15,7,new PartyPirate());
		disko3.setCapo(new Capo(donCorleone));
		
		Guest gast1 = new Guest("Bellmann",9);
		gast1.enterDisco(disko1);
		gast1.enterDisco(disko2);
		gast1.enterDisco(disko3);
	}
}