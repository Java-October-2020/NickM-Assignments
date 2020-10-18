public class Human {
    private int strength = 3;
    private int intelligence = 3;
    private int stealth = 3;
    private int health = 100;

    public Human(){

    }

    public void attack(Human target){
        target.health -= this.strength;
        System.out.println(target.getClass().getCanonicalName() + " health is now: " + health);
    }
    
    public Human(int strength, int intelligence, int stealth, int health){
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
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