
package lab10;

public class BankAccount {
   protected int accountNumber;  
   protected double balance;  
   protected String currency;  
    
    public BankAccount()  
    {  
        accountNumber = -1 ;  
        balance = 0;  
        currency = ""; 
    } 
    
    public BankAccount(int accountNum, double initialBalance) 
    { 
        accountNumber = accountNum;  
        balance = initialBalance;  
        currency = "SAR";  
    } 
    
    public BankAccount(int accountNum, String aCurrency)  
    { 
        accountNumber = accountNum;  
        balance=0; 
        currency=aCurrency; 
    } 
    
    public BankAccount(int accountNum,double initialBalance,String aCurrency){ 
        accountNumber=accountNum; 
        balance=initialBalance; 
        currency=aCurrency; 
    } 
    
    
    public int getAccountNumber(){ 
        return accountNumber; 
    } 
    public double getBalance(){ 
        return balance; 
    } 
    public String getCurrency(){ 
        return currency; 
    } 
    public void setAccountNumber(int accountNum){ 
        accountNumber=accountNum; 
    } 
    public void setBalance(double updatedBalance){ 
        balance=updatedBalance; 
    } 
    public void setCurrency(String aCurrency){ 
        currency=aCurrency; 
    } 
    
    
    public boolean withdraw(double amount){ 
        if(amount<=0) 
            return false; 
        if(balance<amount) 
            return false; 
        balance-=amount; 
        return true; 
    } 
    public boolean deposit(double amount){ 
        if(amount<=0) 
            return false; 
        balance+=amount; 
        return true; 
    } 
    public String toString()
    { 
        return String.format("Ranck Account Number "+accountNumber+" includes "+(currency+balance)); 
    } 
    
    public boolean Transfer(BankAccount x, double amount){
        if(this.balance > amount){
            withdraw(amount);
            x.deposit(amount);
            return true;
        }
        
        System.out.println("Transfer transaction is not compiled!!");
        return false;
    }
//weam ahmed 2417387


}

