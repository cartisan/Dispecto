
public class Disko {
	public String name;
	public int ansehen;
	private int haerte;
	
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

	public Disko(String name, int ansehen, int haerte) {
		super();
		this.name = name;
		this.ansehen = ansehen;
		this.haerte = haerte;
	}

	public void betreten(Gast gast) {
		// Setzt Party-kontext des Gastes
	}
	
	public void trinken(Gast gast) {
		System.out.println(gast.getName() + " trinkt etwas."); 				//CONC: Logging
		
		gast.addPegel(haerte);
		gast.addAusgaben(ansehen);
	}
	
	public void tanzen(Gast gast) {
		System.out.println(gast.getName() + " tanzt eine Weile."); 				//CONC: Logging
		
		gast.subPegel(haerte);
	}
	
}
