package pt.isel.leic.lae.logger;

class Info {
	private final int num; 
	private String name;
	
	public Info(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() { return num; }

	public String getName() { return name; }
	public void setName(String value) { name = value; }
}

public class UseLogger {
	public static void main(String[] args) throws Exception {
		Logger.log(null);
		Logger.log("ISEL");
		Logger.log(new Info(12345, "Odysseas Vlachodimos"));
		Logger.log(new Info(23456, "David Neres"));
		
		final var hmap = new java.util.HashMap<Integer, String>();
		hmap.put(12345, "Odysseas Vlachodimos");
		hmap.put(23456, "David Neres");
		
		Logger.log(hmap);
	}
}
