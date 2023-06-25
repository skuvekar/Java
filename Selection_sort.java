//selection sort
import java.util.Scanner;
class Selection_sort {
    public static void main(String[] args) {
        int [] arr = {50, 40, 10, 79, 62, 14};
        int temp;
        for(int i=0; i<arr.length; i++){
            int min= arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                    //break;
                }
            }
        }
        
        System.out.println("The sorted array is: ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
       
    }
}
