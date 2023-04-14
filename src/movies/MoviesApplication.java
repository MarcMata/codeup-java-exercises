package movies;
import  util.Input2;

import java.util.Arrays;
import java.util.Objects;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean hitZero = true;
        while (hitZero) {
        Input2 input = new Input2();
        int userInput = input.getInt("""
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                                
                Enter your choice:""");
        System.out.println(userInput);
        Movie[] allMovies = MoviesArray.findAll();
        switch (userInput) {
            case 0:
                System.out.println("You chose option to exit.");
                hitZero = false;
                break;
            case 1:
                for (Movie movie : allMovies) {
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                for (Movie movie : allMovies) {
                    if (Objects.equals(movie.getCategory(), "animated")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            case 3:
                for (Movie movie : allMovies) {
                    if (Objects.equals(movie.getCategory(), "drama")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            case 4:
                for (Movie movie : allMovies) {
                    if (Objects.equals(movie.getCategory(), "horror")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            case 5:
                for (Movie movie : allMovies) {
                    if (Objects.equals(movie.getCategory(), "scifi")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    }

}
