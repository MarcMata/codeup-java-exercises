package vehicle;

import java.util.ArrayList;

public class VehicleCollections {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        Vehicle truck = new Vehicle("Truck");
        Vehicle cyberTruck = new Vehicle("Cyber Truck");

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(car);
        vehicleList.add(truck);
        vehicleList.add(cyberTruck);
        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getName());
        }

        System.out.println(vehicleList.size());

        System.out.println(vehicleList.get(0).getName());

    }
}
