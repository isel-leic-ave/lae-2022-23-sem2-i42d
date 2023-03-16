package pt.isel.leic.lae;

public class ClassWithProperties {
	private final int num;
	private final String txt;
	private double flt;
	
	public ClassWithProperties(int number, String txt, double flt) {
		this.num = number + 1000;
		this.txt = txt;
		this.flt = flt;
	}

	public int    getNum()             { return num; }
	public String getTxt()             { return txt; }
	public double getFlt()             { return flt; }
	public void   setFlt(double value) { flt = value; }

	public void mcwp(Object arg) {
		System.out.printf("num: %d ; txt: %s ; flt: %f; arg: %s\n", num, txt, flt, arg);
	}

	public String toString() {
		return "SLB";
	}

	public static void lae() {}
}
