//CONC: PartyArt
public class Plan90s implements GuestPartyContext {
	public void party(Guest guest, Disco disco) {
		disco.drink(guest);
		disco.drink(guest);
		disco.dance(guest);
		disco.drink(guest);
		disco.dance(guest);
		guest.leaveDisco();
	}
}
