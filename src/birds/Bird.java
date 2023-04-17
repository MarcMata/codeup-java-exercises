package birds;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(this.name + " goes Tweet tweet");
    }
    public void layEgg(){
        System.out.println("Laying an egg");
    }
}
