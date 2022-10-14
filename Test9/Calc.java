package Test9;

public class Calc {
    int x, y;

    Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void add() {
        if (x > 0 && y > 0) {
            int sum = x + y;
            System.out.println("The sum of numbers is: " + sum);
        } else {
            System.out.println("The numbers must be positive only");
        }
    }

    void mul() {
        if (x > 0 && y > 0) {
            int mul = x * y;
            System.out.println("The multiply of numbers is: " + mul);
        } else {
            System.out.println("The numbers must be positive only");
        }

    }

    void printBigger() {
        if (x > 0 && y > 0) {
            int printBigger = Math.max(x, y);
            System.out.println("The bigger number is: " + printBigger);
        } else {
            System.out.println("The numbers must be positive only");
        }
    }

    public static void main(String[] args) {
        Calc c = new Calc(8, 12);
        c.add();
        c.mul();
        c.printBigger();
    }


}
