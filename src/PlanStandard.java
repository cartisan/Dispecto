//CONC: PartyArt
public class PlanStandard implements GuestPartyContext {

	public void party(Guest guest, Disco disco) {
		disco.dance(guest);
		disco.dance(guest);
		disco.dance(guest);
		disco.dance(guest);
		disco.drink(guest);
		guest.leaveDisco();
	}

}
