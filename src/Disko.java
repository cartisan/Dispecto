
public class Disko {
	public String name;
	public int ansehen;
	private int haerte;
	private PartyKontext party;		// PAT: State-Pattern
	
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

	public Disko(String name, int ansehen, int haerte, PartyKontext party) {
		super();
		this.name = name;
		this.ansehen = ansehen;
		this.haerte = haerte;
		this.party = party;
	}

	public void betreten(Gast gast) {
		// Setzt Party-kontext des Gastes
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
