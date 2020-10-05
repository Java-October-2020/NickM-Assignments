public class FizzBuzz {
    public String FizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0){
          return "FizzBuzz";  
        } else if(number % 3 == 0){
            return "Fizz";
        } else if(number % 5 ==0){
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    public void counterFizzBuzz(int num){
        for(int i = 0; i<=num; i++){
            String result = FizzBuzz(i);
            System.out.println("Number: " + i + " - Result: " + result);
        }
    }
}