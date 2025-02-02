
package lab10;

public class CurrentAccount  extends BankAccount {
    public String toString()
    { 
        return String.format("current Account Number "+accountNumber+" includes "+(currency+balance)); 
    } 
}