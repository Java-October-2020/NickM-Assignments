import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    Random store = new Random();
    public void findSumAndSum(){
        int[] newArr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> bigArr = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < newArr.length; i++){
            sum += newArr[i];
            if(newArr[i] > 10){
                bigArr.add(newArr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(bigArr);
    }
    public void rayManipulator(){
        ArrayList<String> nameArr = new ArrayList<String>();
        nameArr.add("Nancy");
        nameArr.add("Jinichi");
        nameArr.add("Fujibayashi");
        nameArr.add("Momochi");
        nameArr.add("ishikawa");

        ArrayList<String> newArr = new ArrayList<String>();

        Collections.shuffle(nameArr);
        System.out.println(nameArr);

        for(int i = 0; i < nameArr.size(); i++){
            if(nameArr.get(i).length() > 5 ){
                newArr.add(nameArr.get(i));
            }
        }
        System.out.println(newArr);
    }
    public void shuffleArr(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Character> newArr = new ArrayList<Character>();
        // System.out.println(Arrays.toString(alphabet));

        for(char c : alphabet){
            newArr.add(c);
        }

        Collections.shuffle(newArr);
        System.out.println(newArr);
        char[] vowels = "aeiou".toCharArray();

        for(int i = 0; i < vowels.length; i++){
            if(newArr.get(0) == vowels[i]){
                System.out.println("The first letter is a vowel dude");
            } 
        }
        System.out.println(newArr.get(25));
        System.out.println(newArr.get(0));
    }
    public int[] generateRandomArray(){
        
        int[] randomArr = new int[10];
        for(int i = 0; i < 10; i++){
           randomArr[i] = store.nextInt(45) + 55;
        }
        // System.out.println(Arrays.toString(randomArr));
        return randomArr;
    }
    public void sortedArray(){
        int[] arrayX = generateRandomArray();
        ArrayList<Integer> arrayZ = new ArrayList<Integer>(arrayX.length);
        for(int i : arrayX){
            arrayZ.add(i);
        }
        Collections.sort(arrayZ);
        System.out.println(arrayZ + "\nThe minimun value is: " + arrayZ.get(0) + "\nThe maximum value is: " + arrayZ.get(arrayZ.size()-1));
    }
    public String createString(){
        String randomString = "";
        for(int i = 0; i < 5; i++){
            char c = (char)(store.nextInt(26) + 'a');
            randomString = randomString + String.valueOf(c);
        }
        // System.out.println(randomString);
        return randomString;
    }
    public void createManyStrings(){
        for(int i = 0; i < 10; i++){
            System.out.println(createString());
        }
    }
}