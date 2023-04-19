package vehicle;

public class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println("honk honk");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println(this.getName() + " goes " + "crryackyackyack");
    }
}
