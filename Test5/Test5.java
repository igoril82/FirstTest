package Test5;

public class Test5 {
    static void funcA(String s) {
        System.out.println("The length of the string " + s + " from funcB is " + s.length());
    }

    static void funcB(String[] arr) {
        for (String s : arr) {
            funcA(s);
        }

    }

    public static void main(String[] args) {
        String[] addArr = {"IT", "Test", "QA", "Car"};
        funcB(addArr);
    }

}
