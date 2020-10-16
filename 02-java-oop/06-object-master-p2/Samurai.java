public class Samurai extends Human {
    public Samurai(String name){
        this.name = name;
        this.health = 200;
        samuraisplaying++;
    }
    public void deathBlow(Human target){
        target.health = 0;
        System.out.println("The Human has been killed!");
        this.health = this.health / 2;
    }
    public void meditate(){
        int halfhealth = this.health / 2;
        this.health = this.health + halfhealth;
    }
    public int howMany(){
        return samuraisplaying;
    }
}
