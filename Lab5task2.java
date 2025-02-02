
//weam ahmed 2417387
package lab5task2;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab5task2 {
    
     public static String decryptString (String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch-=aKey;
            
            outputStr+=ch;
            
        }
       return outputStr;
    }
    
    
  public static boolean decryptFile (String inputFileName, String outputFileName,int aKey) throws IOException{
         File file=new File(inputFileName);
  if(file.exists()){
         Scanner readFile=new Scanner(file);
         PrintWriter write=new PrintWriter(outputFileName);
       
         while(readFile.hasNext()){
              String inputString=readFile.nextLine();
              String decryptedLine=decryptString(inputString,aKey);
              write.println(decryptedLine);
          }


            readFile.close();
            write.close();
            
            return true;
         }else{
             return false;
         }
      
        
       
   }
    
    public static void main(String[] args) throws IOException{
        Scanner input=new Scanner(System.in);
       String inputFileName,outputFileName;
       int key;
        System.out.print("Enter input file name (ex: in.txt) : ");
        inputFileName=input.nextLine();
        System.out.print("Enter output file name (ex: out.txt) :");
        outputFileName=input.nextLine();
        System.out.print("Enter key for encyption : ");
        key=input.nextInt();
        
        if(decryptFile(inputFileName,outputFileName,key)){
            System.out.println("decryption done");
        }else{
            System.out.println("Error in file");
        }
        
        
    }
    
}
