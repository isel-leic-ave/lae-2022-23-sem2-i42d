package pt.isel.leic.lae.lesson17;

import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
        // Without generics
        ArrayList listObjectsForStrings = new ArrayList();
        Object o = new Object();

        listObjectsForStrings.add(o); // This is valid and it shouldn't
        listObjectsForStrings.add("SLB");

        String s = (String) listObjectsForStrings.get(0); // Must always do an explicit cast

        // With generics
        ArrayList<String> listString = new ArrayList<String>();

        //listString.add(o); // This is invalid. Does not even compile
        listObjectsForStrings.add("SLB");
        String s1 = listString.get(0);  // Explicit cast not needed

    }
}
