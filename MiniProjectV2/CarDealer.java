package MiniProjectV2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarDealer {
    private Map<String, Car> stock;

    public CarDealer() {
        stock = new HashMap<>();
    }

    public void addCar(Car car) {
        stock.put(car.getVin(), car);
    }

    public void deleteCar(String vin) {
        stock.remove(vin);
    }

    public void updateCar(String vin, Integer newPrice, Double newRating) {
        Car car = stock.get(vin);
        if (car != null) {
            car.setPrice(newPrice);
            car.rateCar(newRating);
        }
    }
        public List<Car> searchByBrand (String brandForSearch) {
            return stock.values().stream()
                    .filter(car -> car.getBrand().equalsIgnoreCase(brandForSearch))
                    .collect(Collectors.toList());
        }

        public void printAllCars() {
            stock.values().forEach(System.out::println);
    }
}
