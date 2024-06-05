package homework_32.task1.task2.entity;

public class Moto extends Vehicle{

    private String styleType;

    public Moto(String vin, String brand, String model, int year, String styleType) {
        super(vin, brand, model, year);
        this.styleType = styleType;
    }

    public String getStyleType() {
        return styleType;
    }

    @Override
    public void showInfo() {
        System.out.println("Moto: VIN = " + getVin() + ", " + getBrand()+ ", " + getModel()+ " (" + getYear() + ") " + ", " + getStyleType());
    }
}
