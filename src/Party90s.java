//CONC: PartyArt
public class Party90s implements PartyContext {
	public Party90s() {
		super();
		Authority.getInstance().report();		//CONC: Authorization
	}

	public void dance(Guest guest, int toughness) {
		guest.subBloodAlcohol(toughness);
	}

	public void drink(Guest guest, int toughness) {
		guest.addBloodAlcohol(2*toughness);
		guest.addExpenses(toughness);
	}
	
	public String getPartyName() {
		return "'90s party";
	}
	
	public GuestPartyContext getGastKontext() {
		return new Plan90s();
	}
}