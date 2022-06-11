
package Q2Financial;

/*
Programmer Name: Ryan Teixeira
Student Number: 991291764
 */

/*
This bank has two objects as its data fields checking and 
savings of the type Account.
This class has four methods as follows:

deposit(double amount, String account) 
withdraw(double amount, String account) 
transfer(double amount, String account) 
printBalances() 

Here the account string is "S" or "C". 
For the deposit or withdrawal, it indicates which account is affected. 
For a transfer it indicates the account from which the 
money is taken; the money is automatically transferred in the other account. 

 */
public class Bank {
    
    /**
     * a new Account called savings and checking were created as data fields.
     */
    Account savings = new Account();
    Account checking =  new Account();
    
    /**
     * withdraw method is used to withdraw from the checking 
     * or savings account.
     * @param amount the value to be withdrawn.
     * @param account type of account to be withdrawn from.
     */
    public void withdraw(double amount, String account){
        if (account.equalsIgnoreCase("C"))
            this.checking.withdraw(amount);
        else
            this.savings.withdraw(amount);
    }
    
    /**
     * deposit method is used to deposit from the checking and savings account.
     * @param amount the value to be deposited.
     * @param account type of account to be withdrawn from. 
     */
    public void deposit(double amount, String account){
        if (account.equalsIgnoreCase("C"))
            this.checking.deposit(amount);
        else
            this.savings.deposit(amount);
    }
    
    /**
     * transfer method is used to transfer from checking to savings 
     * and vice versa.
     * @param amount the value to be withdrawn and deposited into another 
     * account.
     * @param account type of account to be withdrawn from.
     */
    public void transfer(double amount, String account) {
        if (account.equalsIgnoreCase("C")) {
            if (this.checking.getBalance() < amount) {
                
                System.out.println("Insufficient funds to transfer");

            } else {
                this.checking.withdraw(amount);
                this.savings.deposit(amount);
            }
        } else if (this.savings.getBalance() < amount) {
            
            System.out.println("Insufficient funds to transfer");

        } else {
            this.savings.withdraw(amount);
            this.checking.deposit(amount);
        }
    }
    
    /**
     * printBalance is used to print the balance of the checking and savings 
     * account.
     */
    public void printBalance(){
        System.out.println("Checking account balance : " + this.checking);
        System.out.println("Savings account balance : " + this.savings);
    }
    
}  
