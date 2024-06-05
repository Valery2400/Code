package lesson_38.code.practice;

public class NoteBook {
    private String model;
    private  String manufacturer;

    public NoteBook(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
    public class Monitor{
        private Double diagonal;

        public Monitor(Double diagonal) {
            this.diagonal = diagonal;

        }
                public Double getDiagonal() {
            return diagonal;
        }
        public void addBrightness(){
            System.out.println("Brightness increased");
        }

        public void decBrightness(){
            System.out.println("Brightness decreased");
        }
}
        public class Hdd {
            private int hddCapacity;

            public Hdd(int hddCapacity) {
                this.hddCapacity = hddCapacity;
            }

            public int getHddCapacity() {
                return hddCapacity;
            }
            public void hddRead(){
                System.out.println("HDD Read");

            }
            public void hddWrite(){
                System.out.println("HDD Write");

            }

        }

    }


