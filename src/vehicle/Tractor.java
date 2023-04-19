package vehicle;

public class Tractor extends Vehicle {
    public Tractor(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println("Tractor noises");
    }
}
