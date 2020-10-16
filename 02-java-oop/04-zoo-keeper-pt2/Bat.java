public class Bat extends Mammal {
    public Bat(){
        super(300);
    }
    public int fly(){
        System.out.println("whoosh motherfucker whoosh");
        energyLevel -= 50;
        return energyLevel;
    }
    public int eatHumans(){
        System.out.println("munch munch munch");
        energyLevel += 25;
        return energyLevel;
    }
    public int attackTown(){
        System.out.println("My cabbages!");
        energyLevel -= 100;
        return energyLevel;
    }
}
