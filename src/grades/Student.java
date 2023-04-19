package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        Student student1 = new Student("Jason");
        Student student2 = new Student("Marc");
        Student student3 = new Student("Javier");
        Student student4 = new Student("John");

        student1.addGrade(40);
        student1.addGrade(50);
        student1.addGrade(70);
        student1.addGrade(30);
        System.out.println(student1.getGrades());
        System.out.println(student1.getGrades().size());
        System.out.printf("%s has a %.2f grade average%n", student1.getName(), student1.getGradeAverage());
        student2.addGrade(100);
        student2.addGrade(99);
        student2.addGrade(150);
        System.out.printf("%s has a %.2f grade average%n", student2.getName(), student2.getGradeAverage());
        student3.addGrade(30);
        student3.addGrade(59);
        student3.addGrade(60);
        System.out.printf("%s has a %.2f grade average%n", student2.getName(), student2.getGradeAverage());
//        student4.addGrade();

    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        if(this.grades.size() == 0){
            return 0;
        }
        double sum = 0;
        for (int grade: this.grades){
            sum+=grade;
        }
        return sum/this.grades.size();
    }
}
