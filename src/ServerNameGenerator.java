public class ServerNameGenerator {

    public static void main(String[] args) {
//array intializer syntax
        String[] adjectives = {
                "Happy", "Gorgeous", "Brilliant", "Energetic", "Charming",
                "Playful", "Majestic", "Delightful", "Graceful", "Vibrant"
        };

        String[] nouns = {
                "Table", "Dog", "Ocean", "Book", "Chair",
                "Mountain", "Cloud", "Spoon", "Tree", "Car"
        };


    int randomNumber1 = (int)(Math.random()*10);
    int randomNumber2 = (int)(Math.random()*10);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.printf("Random Name: %s%s%n", nouns[randomNumber1], adjectives[randomNumber2]);

    }
    private static String[] adjectives2 = {
            "Happy", "Gorgeous", "Brilliant", "Energetic", "Charming",
            "Playful", "Majestic", "Delightful", "Graceful", "Vibrant"
    };

    private static  String[] nouns2 = {
            "Table", "Dog", "Ocean", "Book", "Chair",
            "Mountain", "Cloud", "Spoon", "Tree", "Car"
    };

}

