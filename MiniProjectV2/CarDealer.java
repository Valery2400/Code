package MiniProjectV2;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;

public class CarDealer {
    private Map<String,Car> stock;

    public CarDealer() {
        stock = new HashMap<>();
    }

    public void addCar(Car car){
        stock.put(car.getVin(),car);
    }
    public void deleteCar(String vin){
        stock.remove(vin);
    }
     public void updateCar(String vin, double newPrice, double newRating) {
        Car car = stock.get(vin);
        if (car != null) {
            car.setPrice(newPrice);
            car.rateCar(newRating);
        }
     }



}
