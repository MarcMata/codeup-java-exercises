public class abstractInterfacesLecture {
    public static void main(String[] args) {
//        Employee newGuy = new Employee("Jason", "Delivery")  NO CAN DO
//        Employee newGuy = new Developer("Jason", "Delivery");
//        System.out.println(newGuy.work());
//        Bear bigBear = new Bear("Yogie","Grizzly",1200,true);
//        System.out.println(bigBear.skin());
          WishList newWishList = new WishList("Wedding Registry", 1, new String[]{"Baby Carriage","Fondue kit","Air Fryer", "Fondue kit", "Single China Set"});
          String newShareLink = newWishList.shareLink();
          System.out.println(newWishList.getName() + " => "  + newShareLink);
    }
}

abstract class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract String work();
}

class Developer extends Employee {

    public Developer(String name, String department){
        super(name, department);
    }
    public String work(){
        return "Writing code...";
    }
}

class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "holding meetings";
    }
}

abstract class Notification {
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();
}

interface Skinnable {
    String skin();
}

abstract class animal {
    protected String name;
    protected String species;
    protected double weight;
    protected boolean isLegendary;

    public animal(String name, String species, double weight, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}

class Bear extends animal implements Skinnable {

    public Bear(String name, String species, double weight, boolean isLegendary) {
        super(name, species, weight, isLegendary);
    }


    @Override
    public String skin() {
        if (this.isLegendary){
            return "Bear hide";
        } else{
            return "YES";
        }
    }
}

abstract class List {
    protected String name;
    protected int id;
    protected String[] items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List(String name, int id, String[] items) {
        this.name = name;
        this.id = id;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }




}

class WishList extends List implements Shareable,Deletable {


    public WishList(String name, int id, String[] items) {
        super(name, id, items);
    }

    @Override
    public String shareLink() {
        //backend things
        return "https://mysharelink.com";
    }

    @Override
    public String delete() {
        return (this.name + "was deleted.");
    }
}

class PrivateList extends List {

    public PrivateList(String name, int id, String[] items) {
        super(name, id, items);
    }
}

