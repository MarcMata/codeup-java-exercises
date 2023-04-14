import Person.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//it will display the memory code
        Person person1 = new Person("John");
        Person person2 = new Person("Jim");
        Person person3 = new Person("Jeff");

        Person[] people = {person1, person2, person3};
        for(Person person: people){
            System.out.println(person.getName());
        }
        System.out.println("-------------------------------");
        Person person4 = new Person("James");
        Person[] newPeopleArray = Person.addPerson(people, person4);
        for(Person person: newPeopleArray){
            System.out.println(person.getName());
        }
    }
}
