package MiniProjectV2;

public class Car {
    private String vin;
    private String brand;
    private String model;
    private int year;
    private double price;
    private double rating;
    private int ratingCounter;
    private boolean isStock;

    public Car(String vin, String brand, String model, int year, double price, double rating, int ratingCounter, boolean isStock) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = rating;
        this.ratingCounter = ratingCounter;
        this.isStock = isStock;
    }

    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public int getRatingCounter() {
        return ratingCounter;

    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rating=" + rating +
                ", ratingCounter=" + ratingCounter +
                ", isStock=" + isStock +
                '}';
    }

    public void rateCar(double newRating) {
        this.rating = (this.rating * this.ratingCounter + newRating)/(++this.ratingCounter);
    }
}
