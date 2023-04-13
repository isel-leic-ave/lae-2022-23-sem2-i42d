package pt.isel.leic.lae.lesson10;

public class BoxUnbox {
    public static void main(String[] args) {
        int i = 10;
        Integer iBoxed = 20;
        Integer iBoxed1 = iBoxed;
        iBoxed = i;
        i = iBoxed;

        m(i);
        m1(i);

        m(iBoxed);
        m1(iBoxed);


    }

    static void m(int x) {

    }

    static void m1(Integer x) {

    }
}
