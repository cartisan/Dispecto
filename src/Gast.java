
public class Gast {
	public String name;
	public Disko disko;
	private int ausgaben;
	private int pegel;
	private int reputation;
	
	public Gast(String name, Disko disko) {
		super();
		this.name = name;
		this.disko = disko;
		this.ausgaben = 0;
		this.reputation = 0;
		this.pegel = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Disko getBesuchtDisko() {
		return disko;
	}

	public void setBesuchtDisko(Disko besuchtDisko) {
		this.disko = besuchtDisko;
	}

	public int getAusgaben() {
		return ausgaben;
	}

	public void setAusgaben(int ausgaben) {
		this.ausgaben = ausgaben;
	}

	public int getPegel() {
		return pegel;
	}

	public void setPegel(int pegel) {
		this.pegel = pegel;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public void besucheDisko() {
		// Starte Strategy zum Disko-Besuch
	}
}
