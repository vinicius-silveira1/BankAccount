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

    public double getBalance() {
        if (!this.isOpen) {
            System.out.println("Cannot get balance of closed account.");
            
        } else {
            System.out.println("Your balance is: " + this.balance); 
            return this.balance;
              
        }
        return 0;
        
    }

    public void deposit(double value) {
        if (this.isOpen && value > 0) {
            this.balance += value;
            System.out.println("Deposit: " + value);
            
        } else if (this.isOpen && value <= 0) {
            System.out.println("Cannot deposit or withdraw zero or negative amount.");
        } else if (!this.isOpen) {
            System.out.println("Cannot deposit in closed account.");
        }
    }

    public void withdraw(double value) {
        if (this.isOpen && value > 0 && this.balance > 0 && value < this.balance) {
            this.balance -= value;
            System.out.println("Withdraw: " + value);
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

    

