import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{
    public void printTo255(){
        int i = 0;
        while(i < 255){
            i++;
            System.out.println("you're at number: " + i);
        }
    }
    public void printOddsTo255(){
        int i = -1;
        while(i < 255){
            i += 2;
            System.out.println("you're at number: " + i);
        }
    }
    public void printSum255(){
        int i = 0;
        int sum = 0;
        while(i < 255){
            i++;
            System.out.println("New Number: " + i + " Sum: " + sum);
            sum = sum + i;
        }
    }
    public void iterateThroughArray(){
        int[] myNumArray = {1,3,3,4,5,12,7,119,9,1};
        for(int i : myNumArray){
            System.out.println(i);
        }
    }
    public void findMax(){
        int[] myNumArray = {1,3,3,4,5,12,7,119,9,1};
        Integer max = myNumArray[0];
        for(int i : myNumArray){
            if(i > max){
                max = i;
            }
        }
        System.out.println("The largst number in this Array is: " + max);
    }  
    public void findAverage(){
        int[] myNumArray = {2,10,3};
        int sum = 0;
        int average = 0;
        for(int i : myNumArray){
            sum += i;
        }
        average = sum/myNumArray.length;
        System.out.println(average);
    }
    public void createOddArray(int num){
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for(int i = 1; i<=num; i += 2){
            oddArray.add(i);
        }
        System.out.println(oddArray);
    }
    public void findBiggerNum(int x){
        int[] myNumArray = {1,3,3,4,5,12,7,119,9,1};
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i : myNumArray){
            if(i > x){
                newArray.add(i);
            }
        }
        System.out.println(newArray.size());
    }
    public void squareTheValues(){
        int[] x = {1,5,10,-2};
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
    }
    public void eliminateNegatives(){
        int[] x = {1,5,10,-2};
        for(int i = 0; i < x.length; i++){
            if(x[i] <= -1){
                x[i] = x[i] * -1;
            }
        }
        System.out.println(Arrays.toString(x));
    }
    public void findMaxMinAverage(){
        int[] x = {1,5,10,-2};
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = x[0];
        int min = x[0];
        int sum = 0;
        int average = x[0];
        for(int i = 0; i < x.length; i++){
            sum = sum + x[i];
            average = sum/x.length;
            if(x[i] > max){
                max = x[i];
            } else if(x[i] < min){
                min = x[i];
            } 
        }
        newArr.add(max);
        newArr.add(min);
        newArr.add(average);
        System.out.println(newArr);
    }
    public void shiftArrayValues(){
        int[] x = {1, 5, 10, 7, -2};
        for(int i = 0; i < x.length; i++){
            if(i < x.length -1){
                x[i] = x[i + 1];
            } else{
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}