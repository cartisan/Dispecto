
public class Gast {
	public String name;
	public Disko disko;
	private int ausgaben;
	private int pegel;
	private int reputation;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Disko getDisko() {
		return disko;
	}

	public void setDisko(Disko disko) {
		this.disko = disko;
	}

	public int getAusgaben() {
		return ausgaben;
	}

	public void addAusgaben(int ausgaben) {
		this.ausgaben += ausgaben;
	}

	public int getPegel() {
		return pegel;
	}

	public void addPegel(int pegel) {
		this.pegel += pegel;
	}
	
	public void subPegel(int pegel) {
		this.pegel -= pegel;
	}

	public int getReputation() {
		return reputation;
	}

	public void addReputation(int reputation) {
		System.out.println(this.name + " bekommt Reputation: " + String.valueOf(reputation)); 		//CON: Logging
		this.reputation += reputation;
	}

	public Gast(String name, Disko disko) {
		super();
		this.name = name;
		this.disko = disko;
		this.ausgaben = 0;
		this.reputation = 0;
		this.pegel = 0;
	}
	
	public void besucheDisko(Disko disko) {
		System.out.println(this.name + " besucht Disko: " + disko.getName()); 		//CON: Logging
		disko.betreten(this);
		
		// Starte Ablauf des Diskobesuchs
	}
}
