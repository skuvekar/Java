public class Arguments{
    public static void main(String args[]){
        int arg = args.length;
         System.out.println("The length of the arguments is : "+arg);
          
         for(int i=0;i<arg;i++)
          System.out.println("The arguments are : "+args[i]);
          
          int a = 0; 
          arg = a;
          for(int j=0; j<args.length; j++){
               a = a + Integer.parseInt(args[j]);  
               
          }  
               
          System.out.println("The addition of all the arguments are : "+a);        
    }
}