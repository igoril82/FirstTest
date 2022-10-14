package Test10;

public class Store {

    private int amount;
    final int size;
    private final Toy[] toys;


    Store (int size) {
        this.amount = 0;
        this.size = size;
        this.toys = new Toy[size];
    }
    void setToys(Toy newToy) {
        if(this.amount < this.size) {
            this.toys[this.amount] = newToy;
            this.amount++;
        }else {
            System.out.println("The store is full");
        }

    }
    void PlayAllToys() {
        for (int i = 0; i < this.amount; i++) {
            this.toys[i].play();
        }
    }
}
