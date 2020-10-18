public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount tester = new BankAccount();

        tester.depositMoney(400, "Checkings");
        tester.showTotal();
        System.out.println(tester.showTotal());
        System.out.println(tester.checkingBalance);

        tester.withdrawMoney(500, "Checkings");
        System.out.println(tester.checkingBalance);
    }
}
