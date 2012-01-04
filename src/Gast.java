
public class Gast {
	public String name;
	public Disko disko;
	private int ausgaben;
	private int pegel;
	private int reputation;
	private GastPartyKontext plan;			//PAT: Strategy
	
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
	
	public GastPartyKontext getPlan() {
		return plan;
	}

	public void setPlan(GastPartyKontext plan) {
		this.plan = plan;
	}

	public Gast(String name) {
		super();
		if (Autorität.meldung()) {			//CONC: Autorisierung
			this.name = name;
			this.disko = null;
			this.ausgaben = 0;
			this.reputation = 0;
			this.pegel = 0;
			this.plan = new PlanStandard();
		}
	}
	
	public void finalize() {
		Autorität.meldung();
	}
	
	public void besucheDisko(Disko disko) {
		System.out.println(this.name + " besucht das " + disko.getName()); 		//CON: Logging
		disko.betreten(this);
		
		plan.feiere(this, disko);						//CONC: PartyArt
	}
	
	public void verlasseDisko() {
		System.out.println(this.name + " verlässt das " + disko.getName()); 		//CON: Logging
		this.disko = null;
		this.wieGehts();								//CONC: Gesundheit
	}

	//CONC: Gesundheit
	public void wieGehts() {
		System.out.println("----------");
		System.out.println("Pegel: " + String.valueOf(this.pegel) + " Ausgaben: " + String.valueOf(this.ausgaben));
		System.out.println("----------");
		
	}
}
