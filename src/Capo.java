//CONC: Autorisierung
public class Capo {
	private int drunks=0;
	private Authority boss=null;
	
	public Capo(Authority boss) {
		this.boss=boss;
	}
	
	public void report() {
		drunks += 1;
		if(drunks>20) {
			boss.report();
			drunks=0;
		}
	}
}