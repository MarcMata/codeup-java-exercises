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
        System.out.println(this.name + " says tweet tweet");
    }

    public void layEggs(){
        System.out.println("Laying an egg.");
    }

    public Bird(){
        System.out.println("New bird created!");
    }
    public Bird(String name){
        this.name = name;
    }
}
