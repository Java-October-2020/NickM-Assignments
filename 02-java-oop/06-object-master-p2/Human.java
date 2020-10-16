public class Human {
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;
    protected int health = 100;
    protected String name = null;
    protected static int samuraisplaying = 0;
    protected static int ninjalsplaying = 0;
    protected static int wizardsplaying = 0;

    public Human(){

    }
    public Human(int strength, int intelligence, int stealth, int health){
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }

    public void attack(Human target){
        target.health -= this.strength;
        System.out.println(target.getClass().getCanonicalName() + " health is now: " + health);
    }

    public int getStrength(){
        return this.strength;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getHealth(){
        return this.health;
    }
}