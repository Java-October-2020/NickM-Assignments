public class Mammal {
    public int energyLevel = 100;

    public Mammal(){

    }

    public int displayEnergy(){
        System.out.println("This Mammals energy level is at: " + energyLevel);
        return energyLevel;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevek(int energylevel){
        this.energyLevel = energylevel;
    }
}