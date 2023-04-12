package rpg;

public class Quote {
    public static void main(String[] args) {
        System.out.println(randomQuote());
    }
    public static String randomQuote() {
        int randomNumber = (int)(Math.random()*4)+1;
        String quote1 = "I find your lack of faith disturbing.";
        String quote2 = "Strike me down and I will become more powerful than you could possibly imagine.";
        String quote3 = "Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.";
        String quote4 = "Never tell me the odds!";
        switch (randomNumber) {
            case 1 -> {
                return quote1;
            }
            case 2 -> {
                return quote2;
            }
            case 3 -> {
                return quote3;
            }
            case 4 -> {
                return quote4;
            }
            default -> {
                return "Star wars";
            }
        }
    }
}
