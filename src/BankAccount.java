public class BankAccount {
    
    protected double balance;
    protected boolean isOpen;
    
    public BankAccount() {
        this.balance = 0;
        this.isOpen = false;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    

    
    private boolean withdrawBiggerThanBalance(double value) {
        if (this.balance < value) {
            System.out.println("Cannot withdraw more money than is currently in the account");
            return true;
        }
    }
    private boolean accountEmpty() {
        if (this.balance == 0) {
            System.out.println("Cannot withdraw money from an empty account");
            return true;
        }
    }
    private boolean negativeValue(double value) {
        if (value < 0) {
            System.out.println("Cannot deposit or withdraw negative amount");
            return true;
        }
    }
    
}

    

