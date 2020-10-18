import java.util.Random;

public class BankAccount {
    protected String accountNumber;
    protected double checkingBalance;
    protected double savingsBalance;
    protected static int numberOfAcounts = 0;
    protected static double totalEconomy = 0;

    public BankAccount() {
        this.accountNumber = BankAccount.randomAccount();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAcounts++;
        totalEconomy = checkingBalance + savingsBalance;
    }
    
    public static int accountCount() {
        return numberOfAcounts;
    }

    public static double totalEconomy() {
        return totalEconomy;
    }

    private static String randomAccount() {
        Random rnd = new Random();
        int accountNumber = rnd.nextInt(999999);
        return String.format("%010d", accountNumber);
    }

    public double depositMoney(double deposit, String account){
        if(account.equals("Savings")){
            savingsBalance += deposit;
            return savingsBalance;
        }
        else if(account.equals("Checkings")){
            checkingBalance += deposit;
            return checkingBalance;
        }
        totalEconomy += deposit;
        return totalEconomy;
    }

    public double withdrawMoney(double withdraw, String account) {
        if(account.equals("Savings")){
            double savingsWithdraw = withdraw;
            savingsBalance -= savingsWithdraw;
            if(savingsBalance < 0){
                System.out.println("insufficient funds");
            }
            return savingsWithdraw;
        }
        if(account.equals("Checkings")){
            double checkingsWithdraw = withdraw;
            checkingBalance -= checkingsWithdraw;
            if(checkingBalance < 0){
                System.out.println("insufficient funds");
            }
            return checkingsWithdraw;
        }
        return withdraw;
    }   
    
    public double showTotal(){
        double total = savingsBalance + checkingBalance;
        return total;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
}