public class Mammal {
    protected int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("This Mammals energy level is at: " + energyLevel);
        return energyLevel;
    }
}