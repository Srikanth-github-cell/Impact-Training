import java.util.Scanner;

public class DistinctNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isNew = true;
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) { isNew = false; break; }
            if (isNew){
                count++;
            }
        }
        System.out.println("distinct elements are:"+count);
    }
}
