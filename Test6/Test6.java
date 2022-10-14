package Test6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        try {

            int num1, num2, num3;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter first number");
            num1 = input.nextInt();
            System.out.println("Please enter second number");
            num2 = input.nextInt();
            System.out.println("Please enter third number");
            num3 = input.nextInt();

            if (num1 > num2 && num2 > num3) {
                System.out.println("The biggest numbers are " + num1 + " and " + num2);
            } else if (num2 > num1 && num3 > num1) {
                System.out.println("The biggest numbers are " + num2 + " and " + num3);
            } else {
                System.out.println("The biggest numbers are " + num1 + " and " + num3);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter only whole numbers");
        }

    }
}
