
public class Disko {
	public String name;
	public int ansehen;
	private int haerte;
	
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
		// erhöht Ausgaben und Pegel des Gastes
	}
	
	public void tanzen(Gast gast) {
		// senkt Pegel des Gastes
	}
	
}
