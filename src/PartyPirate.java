//CONC: PartyArt
public class PartyPirate implements PartyContext {

	public PartyPirate() {
		super();
		Authority.getInstance().report();		//CONC: Autorisierung
	}

	public void dance(Guest guest, int toughness) {
		guest.subBloodAlcohol(toughness-5);
	}

	public void drink(Guest guest, int toughness) {
		guest.addBloodAlcohol(toughness);
		guest.addExpenses(5*toughness);
	}
	
	public String getPartyName() {
		return "Pirate-party";
	}
	
	public GuestPartyContext getGastKontext() {
		return new PlanPirate();
	}

}
