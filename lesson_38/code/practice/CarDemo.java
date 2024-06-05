package lesson_38.code.practice;

public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car(2) ;

        Car.Door myDoor= myCar.new Door(140,120);

        myDoor.open();
        myDoor.close();
        myCar.readyToDrive();

        System.out.println(myCar);
        System.out.println(myDoor.getLength()+ " x " + myDoor.getHeight());




    }
}
