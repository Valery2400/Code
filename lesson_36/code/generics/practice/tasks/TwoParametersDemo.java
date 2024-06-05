package lesson_36.code.generics.practice.tasks;

public class TwoParametersDemo {
    public static void main(String[] args) {

        TwoParameters<String,Integer> twoParameters1 = new TwoParameters<>("first", 123);
        TwoParameters<Double,String> twoParameters2 = new TwoParameters<>(23.13, "Hello");

        System.out.println(twoParameters1);
        System.out.println(twoParameters2);



    }
}
