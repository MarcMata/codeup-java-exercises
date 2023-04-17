package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird quaker = new Quaker();
        //if no constructor use quaker.setName("Quaker")
        quaker.setName("Quaker");
        quaker.makeNoise();
        quaker.layEgg();
        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();
    }
}
