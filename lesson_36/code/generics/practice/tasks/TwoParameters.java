package lesson_36.code.generics.practice.tasks;

public class TwoParameters <T,U> {
    private T first;
    private U second;

    public TwoParameters(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "TwoParameters{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

