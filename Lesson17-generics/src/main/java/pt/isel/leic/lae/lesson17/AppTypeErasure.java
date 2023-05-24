package pt.isel.leic.lae.lesson17;

import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class A {
    private String txt;

    A(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }
}

class B extends A {

    B(String str) {
        super(str);
    }

    void show() {
        System.out.println(getTxt());
    }
}
public class AppTypeErasure {
    static <R> List<R> checkedAs(List<?> list, Class<R> klass) {
//        for (Object elem: list) {
//            klass.cast(elem);
//        }
        return (List<R>)list;
    }
    public static void main(String[] args) {
        List<A> la = Arrays.<A>asList(new B("One"), new B("Two"), new A("Three"));

        //List<B> lb = (List<B>)la;
        A a = new A("SLB");
        B b = new B("SLB");

        Class aClass = a.getClass();
        Class bClass = b.getClass();


        Class listClass = List.class;
        Class lClass = la.getClass();

        System.out.println(aClass.isInstance(a));
        System.out.println(aClass.isInstance(b));
        System.out.println(lClass.isInstance(la));

        List<B> lb = checkedAs(la, B.class);

        Iterator<B> iterator = lb.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            B elem = (B)o;
            System.out.println(elem);
        }

//        for (B elem: lb) {
//            System.out.println(elem);
//        }

    }
}
