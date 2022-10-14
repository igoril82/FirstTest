package Test3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            int num;
            int sum = 0;

            do {
                System.out.println("Please enter you number");
                num = input.nextInt();
                sum += num;

            } while (sum <= 20);
            System.out.println("The total of you numbers is greater that 20. The correct sum is " + sum);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred. Please enter only whole numbers");
        }

    }
}
