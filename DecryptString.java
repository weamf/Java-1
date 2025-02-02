//WEAM AHMED 2417387
package lab4b;
import java.util.Scanner;

public class DecryptString {
    public static String encryptString(String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch+=aKey;
            outputStr+=ch;
        }
       return outputStr;}
      public static String dyscryptString(String inputString, int aKey){
          String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch-=aKey;
            outputStr+=ch;
        }
       return outputStr;
      }     

   
    public static void main(String[] args) {
         Scanner input =new Scanner (System.in);
       String inputStr,outputStr="";
       int key;
        char repeat;
       do{
        System.out.print("Enter string to encrypt :");
        inputStr=input.nextLine();
        System.out.print("Enter key : ");
        key=input.nextInt();
             String encryptedtr = encryptString(inputStr,key);
        System.out.println("The encrypted string is: "+ encryptedtr);
        System.out.println("The original string is: "+ dyscryptString(encryptedtr,key));
         System.out.println("do you want to repeat(y/n)");
             repeat = input.next().charAt(0);
         input.nextLine();
       }while(repeat=='y'||repeat=='Y');
    }
    }
    

