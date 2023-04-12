package rpg;

public class RPG {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Elon_Musk");
        fighter1.setHitPoints(25);
        fighter1.setMaxDamage(15);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Jeff_Bezos");
        fighter1.setHitPoints(20);
        fighter1.setMaxDamage(10);
        fighter2.printStats();

        Dog dog1 = new Dog();
        dog1.setName("Max");
        dog1.setSound("Woof");
        dog1.setHitPoints(20);
        dog1.setMaxDamage(50);
        dog1.makeSound();
        dog1.printStats();
    }
}
