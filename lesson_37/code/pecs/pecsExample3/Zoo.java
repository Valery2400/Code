package lesson_37.code.pecs.pecsExample3;

public class Zoo <T>{

    private T item;

    public Zoo(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
