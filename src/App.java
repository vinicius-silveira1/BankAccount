public class App {
    public static void main(String[] args) throws Exception {
        
        BankAccount myAccount = new BankAccount();

        myAccount.open();

        myAccount.getBalance();

        myAccount.deposit(350.0);

        myAccount.getBalance();

        myAccount.withdraw(125.0);

        myAccount.getBalance();

        myAccount.close();

        myAccount.deposit(10.0);
        myAccount.withdraw(10.0);

        myAccount.open();

        myAccount.deposit(0);
        myAccount.deposit(-20);
        myAccount.withdraw(500);
    }
}
