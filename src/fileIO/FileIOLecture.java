package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.text.MaskFormatter;

public class FileIOLecture {
    public static void main(String[] args) {
        //create files, check if files exist, read directories, add files, edit files.
        //Absolute links versus relative links.
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)){
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Files.notExists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        //the directory and the file exist now
        List<String> groceryList = Arrays.asList("Coffee,$23.99", "Milk,$0.99","Double Stuf Oreos,$4.99");
        System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(
                    dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND
            );
        } catch(IOException e) {
            e.printStackTrace();
        }
        //grocery list definitely created now
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            System.out.println(groceryListFromFile);
            for (int i = 1; i < groceryListFromFile.size(); i++){
                System.out.println(i + ": " + groceryListFromFile.get(i-1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //We have our list! Now lets double-check it!
        Boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {

                if (line.equalsIgnoreCase("Powdered Sugar")) {
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        //we know if powdered sugar is in there or not
        if (!hasPowderedSugar) {
            List<String> addPowderedSugar = Arrays.asList("Powdered Sugar");
            try {
                Files.write(
                        dataFile,
                        addPowderedSugar,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //uh oh, we have some of those people who don't like doule stuf
        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for (String line:lines){
                if (line.equals("Double Stuf Oreos")){
                    newList.add("Regular Oreos");
                } else {
                    newList.add(line);
                }
            }
            Files.write(dataFile, newList);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
