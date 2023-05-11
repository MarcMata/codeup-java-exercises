package Java2Study;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{
    public boolean trained;
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public String snuggle(){
        return this.getName() + " wants to snuggle";
    }

    public static void allSnuggle(ArrayList<PetDog> arrList1){
        for(PetDog dog : arrList1){
            System.out.println(dog.snuggle());
        }
    }
    //make a method that makes the dog bark
    public String bark(){
        return this.getName() + " barks";
    }

    //make a method that makes the dog fetch
    public String fetch(){
        return this.getName() + " fetches";
    }

}
