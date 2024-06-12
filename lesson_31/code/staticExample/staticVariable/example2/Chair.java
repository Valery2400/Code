package lesson_31.code.staticExample.staticVariable.example2;

public class Chair {

    static int chairCounter = 0;

    int id;

    String model;

    public Chair(int id, String model) {
        this.id = id;
        this.model = model;
        chairCounter++;
    }
}
