public class Character {

    // attributes
    private int lifePoints;
    private int defensePoints;
    private int attackPoints;
    public String img;

    // setters and getters
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    // constructor
    public Character(String img, int lifePoints, int defensePoints, int attackPoints) {
        this.img = img;
        this.lifePoints = lifePoints;
        this.defensePoints = defensePoints;
        this.attackPoints = attackPoints;
    }

    public void printing() {
        System.out.println("--------------------------------------");
        System.out.println(img);
        System.out.println("Life Points: " + getLifePoints());
        System.out.println("Attack Points: " + getAttackPoints());
        System.out.println("--------------------------------------");
    }

    public int addLifeAndDefense(int life, int def) {
        return life + def;
    }

    public void attack(Character c) {
        int newLP;
        // int opponentLifeandDefense = addLifeAndDefense(c.getLifePoints(),
        // c.getDefensePoints());
        // System.out.println(opponentLifeandDefense);
        newLP = c.getLifePoints() - getAttackPoints();
        c.setLifePoints(newLP);
        System.out.println("Attacking...............");
        System.out.println(c.img + " life points = " + c.getLifePoints());
    }

    public void die() {
        System.out.println(img + " is dead.");
        System.out.println("G A M E    O V E R");
    }

}