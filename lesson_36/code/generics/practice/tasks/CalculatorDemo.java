package lesson_36.code.generics.practice.tasks;


public class CalculatorDemo {

    public static void main(String[] args) {


        Calculator<Integer, Double> calculator1 = new Calculator<>(20, 10.5);
        Calculator<Double, Integer> calculator2 = new Calculator<>(15.5, 10);
        Calculator<Float, Integer> calculator3 = new Calculator<>(34.45f, 10);

        calculator1.printNumber();
        System.out.println(calculator1.addition(calculator1.getNumber1(), calculator1.getNumber2()));
        System.out.println(calculator1.multiplication(calculator1.getNumber1(), calculator1.getNumber2()));
        System.out.println(calculator1.division(calculator1.getNumber1(), calculator1.getNumber2()));
        System.out.println(calculator1.subtraction(calculator1.getNumber1(), calculator1.getNumber2()));

        calculator2.printNumber();
        System.out.println(calculator2.addition(calculator2.getNumber1(), calculator2.getNumber2()));
        System.out.println(calculator2.multiplication(calculator2.getNumber1(), calculator2.getNumber2()));
        System.out.println(calculator2.division(calculator2.getNumber1(), calculator2.getNumber2()));
        System.out.println(calculator2.subtraction(calculator2.getNumber1(), calculator2.getNumber2()));

        calculator3.printNumber();
        System.out.println(calculator3.addition(calculator3.getNumber1(), calculator3.getNumber2()));
        System.out.println(calculator3.multiplication(calculator3.getNumber1(), calculator3.getNumber2()));
        System.out.println(calculator3.division(calculator3.getNumber1(), calculator3.getNumber2()));
        System.out.println(calculator3.subtraction(calculator3.getNumber1(), calculator3.getNumber2()));



    }
}