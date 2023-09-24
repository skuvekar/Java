//wap to find the frequency of element in array
import java.util.*;
public class ElementFrequencyArray{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer>s = new Stack<Integer>();
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(s.contains(arr[i])){
                    break;
                }
                else if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>1){
                s.push(arr[i]);
                System.out.println(arr[i]+" "+count);
            }
            else if(s.contains(arr[i])==false){
                System.out.println(arr[i]+" "+count);
            }  
        }
        System.out.println(s);
    }
}
