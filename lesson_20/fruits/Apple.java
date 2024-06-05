package fruits;

public class Apple extends Fruit{
    private String color;

    public Apple(String[] vitamins, int sugar, String color) {
        super(vitamins, sugar);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}





