public class Guest {
	public String name;
	public Disco visits;
	private int expenses;
	private int bloodAlcohol;
	private int reputation;					//CONC: TeamReputation
	private GuestPartyContext plan;			//PAT: Strategy		CONC: PartyArt
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Disco getDisco() {
		return visits;
	}

	public void setDisko(Disco disco) {
		this.visits = disco;
	}

	public int getExpenses() {
		return expenses;
	}

	public void addExpenses(int expenses) {
		this.expenses += expenses;
	}

	public int getBloodAlcohol() {
		return bloodAlcohol;
	}

	public void addBloodAlcohol(int bloodAlcohol) {
		this.bloodAlcohol += bloodAlcohol;
	}
	
	public void subBloodAlcohol(int bloodAlcohol) {
		this.bloodAlcohol -= bloodAlcohol;
	}

	//CONC: TeamReputation
	public int getReputation() {
		return reputation;
	}
	
	//CONC: TeamReputation
	public void addReputation(int reputation) {
		System.out.println(this.name + " gets reputation: " + String.valueOf(reputation)); 		//CON: Logging
		this.reputation += reputation;
	}
	
	// CONC: PartyArt
	public GuestPartyContext getPlan() {
		return plan;
	}

	// CONC: PartyArt
	public void setPlan(GuestPartyContext plan) {
		this.plan = plan;
	}

	public Guest(String name, int reputation) {
		super();
		if (Authority.getInstance().report()) {				//CONC: Autorisierung
			this.name = name;
			this.visits = null;
			this.expenses = 0;
			this.reputation = reputation;					//CONC: TeamReputation
			this.bloodAlcohol = 0;
			this.plan = new PlanStandard();					// CONC: PartyArt
		}
	}
	
	//CONC: Autorisierung
	public void finalize() {
		Authority.getInstance().report();
	}
	
	public void enterDisco(Disco disco) {
		System.out.println(this.name + " has a look at the " + disco.getName() +  ","); 	//CONC: TeamReputation, Logging
		if(this.reputation > disco.getPrestige()) {											//CONC: TeamReputation
			System.out.println("finds it repulsive and leaves.");							//CONC: TeamReputation, Logging
		}
		else {															//CONC: TeamReputation
			System.out.println("and enters the location pleased.");		//CONC: Logging 		
			disco.enter(this);
			plan.party(this, disco);									//CONC: PartyArt	
		}
	}
	
	public void leaveDisco() {
		System.out.println(this.name + " leaves the " + visits.getName()); 		//CONC: Logging
		this.visits = null;
		this.whatsUp();								//CONC: Healthiness
	}

	//CONC: Healthiness
	public void whatsUp() {
		System.out.println("----------");
		System.out.println("Blood alcohol level: " + String.valueOf(this.bloodAlcohol) + " expenses: " + String.valueOf(this.expenses));
		System.out.println("----------");
	}
}