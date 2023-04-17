package vehicle;

import birds.Bird;
import birds.Quaker;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle tractor = new Tractor();
        Vehicle truck = new Truck();
        Vehicle car = new Car();

        truck.makeNoise();
        tractor.makeNoise();
        car.makeNoise();
    }

}
