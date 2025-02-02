//weam ahmed 2417387
package lab6;
import java.util.Scanner;


public class ArrayProcessor {
    
    public static int[] removeElement(int array[],int value){
        int size=0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]!=value)
                size++;
        }
        
        
        int[] copy = new int[size];
        
        
        
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=value){
                copy[count]=array[i];
                count++;
            }
        }
        
        
        return copy;
    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int remove;
        System.out.println("Enter the size of Array : ");
        int size=input.nextInt();
        
        int [] myArray=new int[size];
        
        System.out.println("Enter "+size+" elemets : ");
        for(int i=0;i<size;i++){
            myArray[i]=input.nextInt();
        }
        
        System.out.println("Enter value to remove from array : ");
        remove=input.nextInt();
        
        
        int [] new_array =removeElement(myArray,remove);
        System.out.println("Elements after remove "+remove+" is : ");
        for(int i=0;i<new_array.length;i++){
            System.out.print(new_array[i]+" ");
        
        
    }
    
}
}
