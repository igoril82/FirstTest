package Test10;

public class Ball extends Toy {
    int radius;
    String material;

    @Override
    void play() {
        System.out.println("playing the ball");
    }

    @Override
    void buy() {
        System.out.println("buying the ball");
    }
}
