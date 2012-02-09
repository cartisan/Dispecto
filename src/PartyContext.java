//CONC: PartyArt
public interface PartyContext {
	public void dance(Guest gast, int haerte);
	public void drink(Guest gast, int haerte);
	public String getPartyName();
	public GuestPartyContext getGastKontext();
}
