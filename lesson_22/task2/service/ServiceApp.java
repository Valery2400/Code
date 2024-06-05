package homework_32.task1.task2.service;


import homework_32.task1.task2.entity.Car;
import homework_32.task1.task2.entity.Moto;
import homework_32.task1.task2.entity.Truck;

public class ServiceApp {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();

        Car car = new Car("1JT435EFGSGFHHGH4", "Toyota", "Camry", 2007);
        Moto moto = new Moto ("4NHGF841T454F8758", "Honda", "Wingstar", 2020, "Chopper");
        Truck truck = new Truck ( "5FTRDFG56FDGH345", "MAN", "TGX", 2015);

    manager.addVehicle(car);
    manager.addVehicle(moto);
    manager.addVehicle(truck);

    manager.assignService(car, "Repair: Oil change");
    manager.assignService(truck,"Repair: Brake disk replasement");
    manager.assignService(moto, "Painting: aerographie" );

    manager.changeServiceStatus(0,"Waiting details");
    manager.printServiceStatus(0);


    }
}
