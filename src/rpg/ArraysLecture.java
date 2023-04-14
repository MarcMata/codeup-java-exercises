package rpg;

import java.util.Arrays;

public class ArraysLecture {
    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length+1);
        newMonsterArray[newMonsterArray.length-1] = newMonster;
        return newMonsterArray;
    }



    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 20, 35, 50);
        Monster ogre = new Monster("Ogre", 20, 35, 50);
        Monster unicorn = new Monster("Unicorn", 20, 35, 50);


//        Monster[] monsters = new Monster[3];
//        monsters[0] = orc;
//        monsters[1] = ogre;
//        monsters[2]= unicorn;

        Monster[] monsters = {orc, ogre, unicorn};
        Monster cloaker = new Monster("Cloaker", 14, 78, 10);

//        for(Monster monster: monsters){
//            System.out.printf("The %s has %d hitpoints%n",monster.getName(), monster.getHitPoints());
//        }
//        for (int i = 0; i < monsters.length; i++){
//            System.out.println(monsters[i].getName());
//        }

        Monster[] newMonsterArray = ArraysLecture.addMonster(monsters, cloaker);
        for(Monster monster : newMonsterArray) {
            System.out.println(monster.getName());
        }

//        int[] numbers = {45, 76, 789, 22, 99, 567};
//
//        //how to sort
//        Arrays.sort(numbers);
//        for (int number : numbers) {
//            System.out.println(number);
//        }

    }
}
