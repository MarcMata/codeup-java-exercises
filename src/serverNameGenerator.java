public class serverNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = new String [10];
        adjectives[0] = "Happy";
        adjectives[1] = "Gorgeous";
        adjectives[2] = "Brilliant";
        adjectives[3] = "Energetic";
        adjectives[4] = "Charming";
        adjectives[5] = "Playful";
        adjectives[6] = "Majestic";
        adjectives[7] = "Delightful";
        adjectives[8] = "Graceful";
        adjectives[9] = "Vibrant";

        String[] nouns = new String[10];
        nouns[0] = "Table";
        nouns[1] = "Dog";
        nouns[2] = "Ocean";
        nouns[3] = "Book";
        nouns[4] = "Chair";
        nouns[5] = "Mountain";
        nouns[6] = "Cloud";
        nouns[7] = "Spoon";
        nouns[8] = "Tree";
        nouns[9] = "Car";


    int randomNumber1 = (int)(Math.random()*10);
    int randomNumber2 = (int)(Math.random()*10);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.printf("Random Name: %s%s%n", nouns[randomNumber1], adjectives[randomNumber2]);

    }

}

