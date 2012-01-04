
public class Disko {
	public String name;
	public int ansehen;
	private int haerte;
	private PartyKontext party;		// PAT: State
	private Capo capo = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnsehen() {
		return ansehen;
	}

	public void setAnsehen(int ansehen) {
		this.ansehen = ansehen;
	}
	
	public void setCapo(Capo capo) {
		this.capo = capo;
	}

	public Disko(String name, int ansehen, int haerte, PartyKontext party) {
		super();
		if (Autoritaet.meldung()) {			//CONC: Autorisierung
			this.name = name;
			this.ansehen = ansehen;
			this.haerte = haerte;
			this.party = party;
		}
	}
	
	public void finalize() {
		Autoritaet.meldung();
	}

	public void betreten(Gast gast) {
		System.out.println("Heute ist " + party.getPartyName()); 				//CONC: Logging,PartyArt
		
		gast.wieGehts();														//CONC: Gesundheit
		if(gast.getPegel()>20) this.capo.meldung();
		
		gast.setPlan(party.getGastKontext());									//CONC: PartyArt
		gast.setDisko(this);
	}
	
	public void trinken(Gast gast) {
		System.out.println(gast.getName() + " trinkt etwas."); 				//CONC: Logging
		party.trinken(gast, haerte);										//CONC: PartyArt
	}
	
	public void tanzen(Gast gast) {
		System.out.println(gast.getName() + " tanzt eine Weile."); 				//CONC: Logging
		party.tanzen(gast, haerte);												//CONC: PartyArt
	}
	
}
