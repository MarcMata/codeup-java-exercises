public class Person {
    public static void main(String[] args) {
        //problem 1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// true
//        System.out.println(person1 == person2);//false
//        problem 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true
        //problem 3
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//john
//        System.out.println(person2.getName());//john
//        person2.setName("Jane");
//        System.out.println(person1.getName());//Jane
//        System.out.println(person2.getName());//Jane because equal

    }



    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public Person(String name) {
        this.name = name;
    }

}
