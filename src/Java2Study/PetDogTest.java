package Java2Study;

import java.util.ArrayList;

public class PetDogTest {
    public static void main(String[] args) {
        PetDog dog1 = new PetDog("Connor", "Great Dane", false);
        PetDog dog2 = new PetDog("Bozo", "Labrador", true);
        PetDog dog3 = new PetDog("kitten", "Chihuahuah", false);
        System.out.println(dog1.snuggle());
        ArrayList<PetDog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dog1.getName() + " is trained? " + dog1.isTrained());
        System.out.println();
        PetDog.allSnuggle(dogs);
        //make the dog bark
        System.out.println(dog1.bark());
        //make the dog fetch
        System.out.println(dog1.fetch());
        //create a new arrayList of dogs with 20 dogs
        ArrayList<PetDog> dogs2 = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            dogs2.add(new PetDog("Dog" + i, "Breed" + i, true));
        }
        //make all the dogs bark
        for(PetDog dog : dogs2){
            System.out.println(dog.bark());
        }
    }
}
