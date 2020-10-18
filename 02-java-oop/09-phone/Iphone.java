public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ring = getRingTone();
        return ring;
    }
    @Override
    public String unlock() {
        
        return "unlocking Iphone now";
    }
    @Override
    public void displayInfo() {
        System.out.println("iphone " + getVersionNumber() + " from " + getCarrier());         
    }
}