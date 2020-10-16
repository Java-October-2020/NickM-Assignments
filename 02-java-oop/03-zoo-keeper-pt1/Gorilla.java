public class Gorilla extends Mammal {

        public int throwSomething(){
            System.out.println("The Gorillas has flung poo");
            energyLevel -= 5;
            System.out.println("The Gorilla has lost some energy");
            return energyLevel;
        }
        public int eatBananas() {
            System.out.println("The Gorilla is happily eating bananas");
            energyLevel += 10;
            if(energyLevel > 100){
                energyLevel = 100;
            }
            return energyLevel;
        }
        public int climb(){
            System.out.println("The Gorilla is now climbing");
            energyLevel -= 10;
            System.out.println("He's quite tired after that");
            return energyLevel;
        }
}
