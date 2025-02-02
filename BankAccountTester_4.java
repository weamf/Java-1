//weam ahmed 2417387 
package lab10;

import java.util.ArrayList;

public class BankAccountTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
       
        
        BankAccount current = new CurrentAccount();
         accounts.add(current);
        accounts.get(0).setAccountNumber(200301) ;
         accounts.get(0).setBalance(8009.78) ;
        accounts.get(0).setCurrency("SAR") ;
       
         
        BankAccount savings = new SavingAccount() ;
        
          accounts.add(savings);
        accounts.get(1). setAccountNumber(400206) ;
         accounts.get(1). setBalance (13000) ;
        accounts.get(1). setCurrency ("SAR") ;
       
        
System.out.println();
System.out.println("Information of Bank Accounts are as follows: ");
System.out.println(current.toString());
System.out.println(savings.toString());
     
   

        for (int i=0; i<accounts.size(); i++){
            System.out.println(accounts.get(i).toString());
        }
        savings.Transfer(current, 1000);
        savings.Transfer(current, 5000);
        //System.out.println(current. toString());
        //System.out.println(savings. toString());  
        for (int i=0; i<accounts.size(); i++){
            System.out.println(accounts.get(i).toString());
        }

        
}
}     //weam ahmed 2417387     