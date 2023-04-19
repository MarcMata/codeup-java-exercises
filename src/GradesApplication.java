
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import  util.Input2;

public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student student1 = new Student("Johnny", "JohnnyBGood1");
        student1.addGrade(90);
        student1.addGrade(45);
        student1.addGrade(80);
        Student student2 = new Student("Wally", "WallStreet432");
        student2.addGrade(100);
        student2.addGrade(90);
        student2.addGrade(90);
        Student student3 = new Student("Jeremy", "PearlJam526");
        student3.addGrade(70);
        student3.addGrade(75);
        student3.addGrade(79);
        Student student4 = new Student("BlackHoleSun", "Soundgarden4321");
        student4.addGrade(25);
        student4.addGrade(45);
        student4.addGrade(100);

        students.put(student1.getGitHubUserName(), student1);
        students.put(student2.getGitHubUserName(), student2);
        students.put(student3.getGitHubUserName(), student3);
        students.put(student4.getGitHubUserName(), student4);

//        students.forEach((student, object) ->System.out.println(student + ": " + object.getGradeAverage()));

//        System.out.printf("|%s |%s |%s |%s |%n", student1.getGitHubUserName(), student2.getGitHubUserName(), student3.getGitHubUserName(), student4.getGitHubUserName());
        System.out.println("""
                Welcome!

                Here are the GitHub usernames of our students:
                """);
        students.forEach((student, object) -> System.out.printf("|%s|", object.getGitHubUserName()));
        Scanner sc = new Scanner(System.in);

        String userConfirmation = "y";
        while (userConfirmation.equalsIgnoreCase("y")) {
            System.out.println("\nWhat student would you like to see more information on? ");
            String userInput = sc.nextLine();
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.printf("%s  - Github UserName: %s%n", student.getName(), student.getGitHubUserName());
                double i = 1;
                for (double grade : student.getGrades()) {
                    System.out.printf("Grade %.0f: %.2f%n", i++, grade);
                }
                System.out.printf("Current average: %.2f%n", student.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("class")){
                double sum = 0;
                int count = 0;
                for (Student student : students.values()){
                    sum += student.getGradeAverage();
                    count++;
                }
                double classAverage = sum / count;
                System.out.printf("The class average is %f%n",classAverage);
            } else {
                System.out.printf("Sorry, no student found with Github username of \"%s\"%n", userInput);
            }
            System.out.println("Would you like to see another student y/n?");
            userConfirmation = sc.nextLine();
        }
        System.out.println("Goodbye");
    }
}


class Student {
    private String name;
    private String gitHubUserName;
    private List<Double> grades;

    public Student(String name, String gitHubUserName) {
        this.name = name;
        this.gitHubUserName = gitHubUserName;
        this.grades = new ArrayList<>();//initialize empty array list
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        if (this.grades.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public String getGitHubUserName() {
        return gitHubUserName;
    }

    public void setGitHubUserName(String gitHubUserName) {
        this.gitHubUserName = gitHubUserName;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

}
