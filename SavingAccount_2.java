/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

public class SavingAccount extends BankAccount{

    private double profitAmount;
    private double profitPercent;
    
    public SavingAccount(){
        profitAmount = 0.0;
        profitPercent = 0.06;
    }
    
    
   public void setProfitPercent(double profitPercent){
       this.profitPercent=profitPercent;
   }
   
   public double getProfitPercent(){
       return profitPercent;
       
   }
   
   public void setProfitAmount(double profitAmount){
       this.profitAmount=profitAmount;
   }
   
   public double getProfitAmount(){
       return profitAmount;
       
   }
   public String toString(){
       double totalBalance = calculateTotalBalance();
       return String.format("Saving Account Number %d includes %.2f+ Profit %.2f= %s %.2f ", accountNumber,balance,profitAmount, currency,totalBalance);
   }
   
   public double calculateTotalBalance(){
       profitAmount = balance*profitPercent;
       double totalBalance=balance+profitAmount;
       return totalBalance;
    }
    public boolean deposit(double amount){ 
        if(amount<1000) {
            System.out.println("deposir 1000 in saving account");
            return false; 
        }
    
        return super.deposit(amount); 
    } 
     public boolean withdraw(double amount){ 
        if(super.withdraw(amount))
        {  profitPercent=0;
            calculateTotalBalance();
            return true;
        }
        return false;
    } 
    
    
}
