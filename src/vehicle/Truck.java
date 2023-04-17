package vehicle;

public class Truck extends Vehicle {
    public void makeNoise(){
        System.out.println("honk honk");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println(this.getName() + " goes " + "crryackyackyack");
    }
}
