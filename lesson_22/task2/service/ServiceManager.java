package homework_32.task1.task2.service;

import homework_32.task1.task2.entity.Vehicle;

public class ServiceManager {
    //размер количества автомобилей на одновременном ремонте
    private Vehicle[] vehicles = new Vehicle[5];

    //размер работ
    private Serviceable[] serviceables = new Serviceable[5];

    private int vehicleCounter = 0;
    private int serviceCounter = 0;

    public void addVehicle(Vehicle vehicle) {
        if (vehicleCounter < vehicles.length) {
            vehicles[vehicleCounter] = vehicle;
            vehicleCounter++;
            System.out.println("Vehicle added: ");
            vehicle.showInfo();

        } else {
            System.out.println("Service full, can't add more vehicles!");
        }
    }

    public void assignService(Vehicle vehicle, String workDescription) {
        if (serviceCounter < serviceables.length) {
            if (workDescription.toLowerCase().contains("repair")) {
                serviceables[serviceCounter] = new Repair(workDescription);
                serviceCounter++;

                System.out.println("Service started for" + vehicle.getBrand() + " " + vehicle.getModel() + " " + workDescription);
            }
            if (workDescription.toLowerCase().contains("paint")) {
                serviceables[serviceCounter] = new Painting(workDescription);
                serviceCounter++;

                System.out.println("Service started for" + vehicle.getBrand() + " " + vehicle.getModel() + " " + workDescription);
            }

            if (workDescription.toLowerCase().contains("paint")) {
                serviceables[serviceCounter] = new Painting(workDescription);
                serviceCounter++;
            }
        } else {
            System.out.println("Can't assign more services, limit reached!");
        }

    }

    public void printServiceStatus(int indexMyOrder) {
        System.out.println(serviceables[indexMyOrder].getWorkStatus());
    }
    public void changeServiceStatus(int orderNumber, String newStatus){
        serviceables[orderNumber].changeWorkStatus(newStatus);
    }
}
