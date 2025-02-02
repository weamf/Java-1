//weam ahmed 2417387
package lab6task2;

import java.util.Scanner;

public class NamesProcessor {
    public static int nameSearch(String [] names,String se){

        for (int i = 0; i < names.length; i++) {
            if(names[i].length()!=se.length())
                continue;
            for (int j = 0; j < se.length(); j++) {
                  if (Character.toLowerCase(names[i].charAt(j)) != Character.toLowerCase(se.charAt(j))) 
                    break; 
                  else if (j == se.length() - 1) 
                    return i;
                
                
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       String search;
        System.out.println("Enter size pf array : ");
        int size=input.nextInt();
        
        String[] names=new String[size];
        
        System.out.println("Enter "+size+" names : ");
        for(int i=0;i<size;i++){
            names[i]=input.next();
        }
        System.out.println("Enter name to search : ");
        search=input.next();
        
        int index=nameSearch(names,search);
        
        if(index==-1){
            System.out.println(search+" not found");
        }else{
            System.out.println(search+" found at index "+index);
        }
        
        
    }
    
}
