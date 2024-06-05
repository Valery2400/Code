package lesson_38.code.practice;

public class Car {
    private int doors;

    public Car(int doors) {
        this.doors = doors;
    }

    public void readyToDrive() {
        System.out.println("Lets GO!");
    }

    public int getDoors() {
        return doors;

    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}';
    }
    public class Door{
        private int length;
        private int heigth;

        public Door(int length, int heigth) {
            this.length = length;
            this.heigth = heigth;
        }

        public int getLength() {
            return length;
        }

        public int getHeight() {
            return heigth;
        }

        public void open() {
            System.out.println("Doors open");
        }

        public void close() {
            System.out.println("Doors close");
        }

    }

}
