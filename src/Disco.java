public class Disco {
	public String name;
	public int prestige;			//CONC: TeamReputation
	private int toughness;
	private PartyContext party;		// PAT: State, CONC: PartyArt
	private Capo capo = null;		//CONC: Authorisation
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//CONC: TeamReputation	
	public int getPrestige() {
		return prestige;
	}

	//CONC: TeamReputation
	public void setPrestige(int prestige) {
		this.prestige = prestige;
	}

	//CONC: Authorisation
	public void setCapo(Capo capo) {
		this.capo = capo;
	}

	public Disco(String name, int prestige, int toughness, PartyContext party) {
		super();
		if (Authority.getInstance().report()) {			//CONC: Authorisation
			this.name = name;
			this.prestige = prestige;
			this.toughness = toughness;
			this.party = party;								//CONC:PartyArt
		}
	}
	
	//CONC: Authorisation
	public void finalize() {
		Authority.getInstance().report();
	}

	public void enter(Guest guest) {
		System.out.println("Today is " + party.getPartyName()); 				//CONC: Logging,PartyArt
		
		guest.whatsUp();														//CONC: Healthiness
		if(guest.getBloodAlcohol()>20) this.capo.report();						//CONC: Authorisation
		
		guest.setPlan(party.getGastKontext());									//CONC: PartyArt
		guest.setDisko(this);
	}
	
	public void drink(Guest guest) {
		System.out.println(guest.getName() + " drinks something."); 			//CONC: Logging
		party.drink(guest, toughness);											//CONC: PartyArt
		this.prestige -=1;														//CONC: TeamReputation
	}
	
	public void dance(Guest guest) {
		System.out.println(guest.getName() + " dances awhile."); 				//CONC: Logging
		party.dance(guest, toughness);											//CONC: PartyArt
		this.prestige +=1;														//CONC: TeamReputation
	}
	
}
