package rpg;

public class Monster {
    private String name;
    private int armorclass;
    private int hitPoints;
    private int MaxDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorclass() {
        return armorclass;
    }

    public void setArmorclass(int armorclass) {
        this.armorclass = armorclass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage() {
        return MaxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        MaxDamage = maxDamage;
    }

    public Monster(String name,int armorclass, int hitPoints, int maxDamage) {
        this.name = name;
        this.armorclass = armorclass;
        this.hitPoints = hitPoints;
        MaxDamage = maxDamage;
    }
}
