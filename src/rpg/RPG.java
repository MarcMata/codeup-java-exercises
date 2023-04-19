package rpg;

import java.util.ArrayList;

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

        Fighter fighter3 = new Fighter("Mark_Zuckerberg", 5, 5);
        fighter3.printStats();



        Dog dog1 = new Dog();
        dog1.setName("Max");
        dog1.setSound(Quote.randomQuote());
        dog1.setHitPoints(20);
        dog1.setMaxDamage(50);
        dog1.makeSound();
        dog1.printStats();

        Dog dog2 = new Dog("Olive", Quote.randomQuote(), 10, 10);
        dog2.makeSound();
        dog2.printStats();

        //did not have to construct. Not an instance method. A STATIC Method
        int d20roll = D20.roll20();
        System.out.println(d20roll);
        System.out.println(Fighter.totalFighters);
        //Arrays are used when you know how much data you are gonna store
        //ARRAY LIST METHOD Use array list when you know the amount of data is gonna change
        ArrayList<Monster> monsterList = new ArrayList<>();
    }
}
