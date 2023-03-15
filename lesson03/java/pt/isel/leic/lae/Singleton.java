package pt.isel.leic.lae;

public class Singleton {
    private final static Singleton instance = new Singleton();
    private Singleton() { }

    private int field1 = 0;
    private String field2 = "0";

    public static Singleton getInstance() { 
        return instance;
    }

    public int getField1() {
        return field1;
    }
    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
