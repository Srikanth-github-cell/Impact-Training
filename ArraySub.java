
import java.util.Scanner;

public class ArraySub {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
       int sub=arr[0];
       for(int j=1;j<n;j++){
        sub-=arr[j];
       }
       System.out.println(sub);
     }
}
