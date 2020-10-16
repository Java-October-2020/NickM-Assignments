public class Tester {
    public static void main(String[] args){
        Human joe = new Human();
        Wizard gandolf = new Wizard("Gandolf");
        Samurai mugen = new Samurai("Mugen");
        Ninja omnibus = new Ninja("Omnibus");

        // gandolf.castFireball(joe);
        // System.out.println(joe.health);
        // gandolf.heal(joe);
        // System.out.println(joe.health);

        // omnibus.steal(joe);
        // System.out.println(joe.health);
        // System.out.println(omnibus.health);
        // omnibus.runAway();
        // System.out.println(omnibus.health);

        mugen.deathBlow(joe);
        System.out.println(mugen.health);
        mugen.meditate();
        System.out.println(mugen.health);
        System.out.println(mugen.howMany());
    }
}
