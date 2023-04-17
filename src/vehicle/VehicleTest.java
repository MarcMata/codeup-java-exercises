package vehicle;

import birds.Bird;
import birds.Quaker;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle tractor = new Tractor();
//        tractor.setName("Tractor");
//        Vehicle truck = new Truck();
//        truck.setName("Truck");
//        Vehicle car = new Car();
//        car.setName("Car");

//        truck.makeNoise();
//        tractor.makeNoise();
//        car.makeNoise();
//        truck.breakingDownNoise();

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Car();
        garage.vehicles[1] = new Truck();
        garage.vehicles[2] = new Tractor();
        garage.alarmCascade();

        //one way to set names???
//        garage.vehicles[0] = new Car();
//        garage.vehicles[0].setName("Car");
//        garage.vehicles[1] = new Truck();
//        garage.vehicles[1].setName("Truck");
//        garage.vehicles[2] = new Tractor();
//        garage.vehicles[2].setName("Tractor");
//        garage.alarmCascade();
    }

}
