import java.util.ArrayList;

class Slb {
    private int x;
    private Object o;
    private int[] a = new int[1_000_000];

    public Slb() {

    }
    public Slb(int x, int o) {
        this.x = x;
        this.o = o;
    }

    public void m1() {

    }
    public void m2() {

    }
}
public class App {

    public static void main(String[] args) {
        int x = 5;
        Slb s = new Slb();
        Slb s1 = new Slb();

        Slb s3 = s;

        s = new Slb();

        s3 = new Slb();
        s = null;


    }
}
