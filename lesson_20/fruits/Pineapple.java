package fruits;

public class Pineapple extends Fruit{

    private int size;

    public Pineapple(String[] vitamins, int sugar, int size) {
        super(vitamins, sugar);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
