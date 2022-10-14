package Test8;

import java.util.HashSet;
import java.util.Set;

public class Test8 {

    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        Set<String> city = new HashSet<>();
        Set<String> phones = new HashSet<>();
        String[] arr = {"052-222", "04-444"};
        int number = arr.length;
        name.add("Ron");
        city.add("TLV");
        phones.add("052-222" + ", " + "04-444");
        System.out.println("person:");
        System.out.println("name:" + name);
        System.out.println("address:");
        System.out.println("city:" + city);
        System.out.println("phones:" + phones);
        System.out.println("numOfPhones:" + number);

    }


}
