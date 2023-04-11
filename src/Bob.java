import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        while (true) {
            Scanner bob = new Scanner(System.in);
            System.out.println("Tell bob anything!!!!");
            String talkingToBob = bob.nextLine();
            if (talkingToBob.trim().endsWith("?")){
                System.out.println("Sure");
            } else if (talkingToBob.trim().endsWith("!")) {
                System.out.println("Whoa Chill out!");
            } else if (talkingToBob.trim().equals("")) {
                System.out.println("Fine! Be that way!");
            } else {
                System.out.println("Whatever!");
            }
            while (true) {
                System.out.println("Continue talking to bob? (Y/N)");
                String response = bob.nextLine();
                if(response.equalsIgnoreCase("Y")) {
                    break;
                } else if (response.equalsIgnoreCase("N")){
                    return; //exits both loops
                } else {
                    System.out.println("You did not enter a valid response");
                }
            }
        }
    }
}
