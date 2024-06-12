package lesson_36.code.generics.practice.tasks;

public class Calculator <T extends Number, U extends Number>{

private final T number1;
private final U number2;

    public Calculator(T number1, U number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public U getNumber2() {
        return number2;

    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }

    public void printNumber(){
    System.out.println("Ваши числа: " + number1 + " и " + number2 );
}

    public double addition(T number1, U number2) {
        return number1.doubleValue() + number2.doubleValue();
    }
    public double multiplication(T number1, U number2) {
        return number1.doubleValue() * number2.doubleValue();
    }
    public double division(T number1, U number2) {
        return number1.doubleValue() / number2.doubleValue();
    }
    public double subtraction(T number1, U number2) {
        return number1.doubleValue() - number2.doubleValue();
    }



}



