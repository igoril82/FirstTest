package Test1;

public class Test1 {

    String name1;
    String name2;
    String name3;

    static String threeStrings(String name1, String name2, String name3) {
        String concatenation = "The concatenation of 3 strings " + name1 + ", " + name2 + ", " + name3 + ", is: " + name1 + name2 + name3;
        return concatenation;
    }

    public static void main(String[] args) {

        try {
            System.out.println(threeStrings("IT", "PC", "TV"));

        } catch (Exception e) {
            System.out.println("General error occurred");
        }


    }
}

