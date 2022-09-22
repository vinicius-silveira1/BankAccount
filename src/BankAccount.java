public class BankAccount {
    
    protected double balance;
    protected boolean isOpen;
    
    public BankAccount() {
        this.balance = 10.5;
        this.isOpen = false;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public double getBalance() {
        if (!this.isOpen) {
            System.out.println("Cannot get balance of closed account.");
            
        } else {
            return this.balance;   
        }
        
    }

    public void deposit(double value) {
        if (this.isOpen && value > 0) {
            this.balance += value;
        } else if (this.isOpen && value <= 0) {
            System.out.println("Cannot deposit or withdraw zero or negative amount.");
        } else if (!this.isOpen) {
            System.out.println("Cannot deposit in closed account.");
        }
    }

    public void withdraw(double value) {
        if (this.isOpen && value > 0 && this.balance > 0 && value < this.balance) {
            this.balance -= value;
        } else if (this.isOpen && value > 0 && this.balance > 0 && value > this.balance) {
            System.out.println("Cannot withdraw value bigger than your balance.");
        } else if (this.isOpen && value > 0 && this.balance == 0) {
            System.out.println("Account empty.");
        } else if (this.isOpen && value <= 0) {
            System.out.println("Cannot deposit or withdraw zero or negative amount.");
        } else if (!this.isOpen) {
            System.out.println("Cannot withdraw from closed account.");
        }
    }

    
    
    
}

    

