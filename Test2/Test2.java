package Test2;

public class Test2 {

    static boolean arrayOfNumbers(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 45;
            System.out.println(arrayOfNumbers(arr, 45));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred. Please enter the correct array length parameter. " + e.getMessage());
        }
    }
}


