package Collections;

import rpg.*;
import Person.*;

import java.util.*;

public class CollectionsLecture {
    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

//        ArrayList<Monster> monsterList = new ArrayList<>();
        //With arrays we have to assign values to variables
        //Array syntax is : monsterArray[0] = blueDragon
//        monsterList.add(orc);
//        monsterList.add(ogre);
//        monsterList.add(blueDragon);

        //all at once

//        ArrayList<Monster> monsterList = new ArrayList<>(List.of(orc, ogre, blueDragon));

//        for(Monster monster : monsterList){
//            System.out.println(monster.getName());
//        }
        //gets the length of the array list
//        System.out.println(monsterList.size());
        //get one item
//        System.out.println(monsterList.get(1).getName());

//        creating a list based on an array
//        Monster[] monsters = {orc, ogre, blueDragon};
//        ArrayList<Monster> monsterLists = new ArrayList<Monster>()(Arrays.asList(monsters));

        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Greg Poovich", 1366);
        careerWins.put("Serena Williams", 973);
        careerWins.put("Roger Federer", 1033);
        careerWins.put("Rafael Nadal", 1001);

//        System.out.println(careerWins);
        //how to use to obtain the value from the key
        int federerWins = careerWins.get("Roger Federer");
//        System.out.println("Roger Federer has won " + federerWins + " matches.");
        //how to check if a key contains the right string
//        boolean nadalExists = careerWins.containsKey("Rafael Nadal");
//        if (nadalExists){
//            System.out.println("Rafael Nadal is in the career wins Hashmap");
//        } else {
//            System.out.println("Nadal is not in the career wins Hashmap");
//        }
        //how to loop through a hashmap. How to target the key and the value
//        for (Map.Entry<String, Integer> entry:careerWins.entrySet()) {
//            System.out.println(entry.getKey() + " has won " + entry.getValue() + " matches.");
//        }
        //how to remove someone from a hashmap
        careerWins.remove("Serena Williams");
//        System.out.println("Serena Williams has been removed from the career wins HashMap.");
//        for (Map.Entry<String, Integer> entry:careerWins.entrySet()) {
//            System.out.println(entry.getKey() + " has won " + entry.getValue() + " matches.");
//        }
        //custom object as a key
        Map<Person, Integer> ageMap = new HashMap<>();
        Person person1 = new Person("John Doe");
        Person person2 = new Person("Jane Doe");
        ageMap.put(person1, 30);
        ageMap.put(person2, 28);

        //List as a value
        Map<String, List<String>> nameMap = new HashMap<>();
        List<String> cities1 = Arrays.asList("New York", "Los Angeles", "Chicago");
        List<String> cities2 = Arrays.asList("Paris","London","Rome");
        nameMap.put("USA", cities1);
        nameMap.put("Europe", cities2);
        //using a set to loop over
        Set<Map.Entry<String, List<String>>> entries = nameMap.entrySet();

        for (Map.Entry<String, List<String>> entry : entries){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println(key + ": " + values);
        }
        nameMap.forEach((country, cities) -> {
            System.out.println(country + ": " + cities);
        });
    }
}
