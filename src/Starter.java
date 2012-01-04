
public class Starter {
	public static void main(String[] args) {
		Disko disko1 = new Disko("Thimbles",10,5,new Party90er());
		Disko disko2 = new Disko("Fork",10,5,new Party‹30());
		
		Gast gast1 = new Gast("Bellmann");
		gast1.besucheDisko(disko1);
		gast1.besucheDisko(disko2);

	}

}
