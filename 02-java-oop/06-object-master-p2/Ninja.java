public class Ninja extends Human {
    public Ninja(String name){
        this.name = name;
        this.stealth = 10;
        ninjalsplaying++;
    }
    public void steal(Human target){
        target.health -= this.stealth;
        this.health += this.stealth;
    }
    public void runAway(){
        System.out.println("The Ninja is legging it");
        health -= 10;
    }
}
