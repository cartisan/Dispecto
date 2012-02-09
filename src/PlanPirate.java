//CONC: PartyArt
public class PlanPirate implements GuestPartyContext {

	public void party(Guest guest, Disco disco) {
		disco.drink(guest);
		disco.drink(guest);
		disco.drink(guest);
		disco.drink(guest);
		disco.drink(guest);
		guest.leaveDisco();
	}

}