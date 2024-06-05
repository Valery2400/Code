package homework_32.task1.task2.entity;

public abstract class Vehicle {

    private String vin;
    private String brand;
    private String model;
    private int year;

    public Vehicle(String vin, String brand, String model, int year) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
            }

    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public abstract void showInfo();
}
