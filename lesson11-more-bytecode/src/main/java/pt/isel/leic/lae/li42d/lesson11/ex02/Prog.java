package pt.isel.leic.lae.li42d.lesson11.ex02;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student extends Person {
    private int number;

    Student(int number, String name) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class Prog {
    public static void main(String[] args) {
        List<Person> l = new ArrayList<>();
        Student s = new Student(234, "abc");
        l.add(s);
        //l.add("SLB");

        s = (Student) l.get(1);

        System.out.println(s);



    }
}