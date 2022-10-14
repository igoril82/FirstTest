package Test7;

import java.util.ArrayList;

public class Person {
    String name;
    int age;

    static void printNames() {
        System.out.println(names);
    }

    static ArrayList<String> names = new ArrayList<>();


    public static void main(String[] args) {
        names.add("Igor");
        names.add("Dvir");
        names.add("Dana");
        names.add("Bob");
        printNames();
    }

}
