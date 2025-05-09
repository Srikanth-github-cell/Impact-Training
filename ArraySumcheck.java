
import java.util.Scanner;

public class ArraySumcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
         sum+=arr[i];
        }
        System.out.println(sum);
        int arr_1[]=new int[m];
        for(int j=0;j<m;j++){
            arr_1[j]=sc.nextInt();
            
        }
        int sum_1=0;
       for(int i=0;i<m;i++){
        sum_1+=arr[i];
       }
       System.out.println(sum_1);
        if(sum==sum_1){
            System.out.println("both same");
        }else{
            System.out.println("not same");
        }
    }
}
