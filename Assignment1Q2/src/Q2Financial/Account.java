 
package Q2Financial;

/*
Programmer Name: Ryan Teixeira
Student Number: 991291764
 */
/*
The Account class has a balance, functions to add and
withdraw money, and a function to inquire the current balance.
If no value is passed the initial balance should be set to $0. 
Charge a $5 penalty if an attempt is made to withdraw more money 
than available in the account. 
 */
public class Account {
    
    /**
     * the declaration of balance.
     */
    private double balance;
    
    /**
     * the default constructor for the Account class.
     */
    public Account(){
        this(0);
    }
 
    /**
     * A constructor that takes balance as a parameter.
     * @param balance the parameter to set the initial balance value.
     */
    public Account(double balance){
        this.balance = balance;
    }
    
    /**
     * A setter that sets a new double balance.
     * @param balance value to be set as new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * A getter to retrieve the balance.
     * @return retrieves balance as a double.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * deposit method adds the amount to the balance.
     * @param amount value to be deposited.
     */
    public void deposit(double amount){
        this.setBalance(this.getBalance()+amount);
    }
    
    /**
     * withdraw method subtracts the amount from the balance.
     * @param amount value to be withdrawn.
     */
    public void withdraw(double amount){
         if (this.getBalance()<amount)
             this.setBalance(this.getBalance()-5);
         else
            this.setBalance(this.getBalance()- amount);
    }
    
    /**
     * toString returns object type as a string.
     * @return formats balance as an integer if equal to 0
     * otherwise returns a double with 2 decimal places 
     */
    @Override
    public String toString(){
                
        if(this.balance == 0){
            int balance = (int)this.balance;
            return String.format("$%d",balance);
        }else {
            return String.format("$%.2f", 
                    this.getBalance());
        }
    }
    
}


