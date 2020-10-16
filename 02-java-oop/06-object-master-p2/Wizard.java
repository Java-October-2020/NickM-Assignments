public class Wizard extends Human {
    public Wizard(String name){
        this.name = name;
        this.health = 50;
        this.intelligence = 8;
        wizardsplaying++;
    }
    public void heal(Human target) {
        target.health += this.intelligence;
    }
    public void castFireball(Human target) {
        target.health -= this.intelligence * 3;
    }
}
