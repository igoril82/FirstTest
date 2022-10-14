package Test10;

public class Main {
    public static void main(String[] args) {
        try {

            Toy toy = new Toy();
            Ball ball = new Ball();
            Store store = new Store(5);

            toy.price = 120;
            toy.color = "Red";
            toy.price = 120;
            toy.color = " Red";

            ball.price = 80;
            ball.color = "Green";
            ball.radius = 50;
            ball.material = "Rubber";

            store.setToys(toy);
            store.setToys(ball);

            store.PlayAllToys();

        } catch (NegativeArraySizeException e) {
            System.out.println("The size of store must be positive");
        }
    }
}
