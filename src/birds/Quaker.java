package birds;

public class Quaker extends Bird{
    public void makeNoise(){

        super.makeNoise();
        System.out.println(this.getName() + " goes Ack-Squeek");
    }
}
