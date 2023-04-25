package Java2Study;

public class PetDog extends Pet implements Companion{
    public boolean trained;
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
        System.out.println(name + Companion.snuggle());
    }

    public boolean isTrained() {
        return trained;
    }
}
