import java.util.Scanner;
public class Addition{
   public static void main(String args[]){
     int i=0, j=0, result;
     Scanner a = new Scanner(System.in);
      
        System.out.println("Enter the 1st no.");
        i = a.nextInt();
        System.out.println("Enter the 2nd no.");
        j = a.nextInt();
           
     result = i+j;
     System.out.println("The result is : "+result);
     {a.close();
     }  
   } 
}       