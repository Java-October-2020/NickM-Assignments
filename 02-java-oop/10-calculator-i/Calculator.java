public class Calculator {
    private double operandOne = 0;
    private double operandTwo = 0;
    private String operation;
    private double result;

    public Calculator() {

    }

    public void setOperandOne(double num) {
        this.operandOne = num;
    }
    public void setOperandTwo(double num) {
        this.operandTwo = num;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    public double getResults() {
        System.out.println(this.result);
        return this.result;
    }

    public void calculateOperation(){
        if(operation == "+"){
            this.result = this.operandOne + this.operandTwo;
        }

        else if(operation == "-"){
            this.result = this.operandOne - this.operandTwo;
        }
        
        else if(operation == "*"){
            this.result = this.operandOne * this.operandTwo;
        }
        else{
            System.out.println("Please preform proper operation!");
        }
    }

}