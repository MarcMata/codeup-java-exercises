package rpg;

public class Dog {
    private String name;
    private String sound;
    private int hitPoints;
    private int maxDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void makeSound() {
        System.out.printf("%s goes %s%n", name, sound);
    }
    public void printStats() {
        System.out.printf("%s has %d hitpoints and does %d maximum damage.%n", name, hitPoints, maxDamage);
    }
}
