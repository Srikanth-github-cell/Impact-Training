
import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int square=n*n;
        int temp=n;
        while(n>0){
            n/=10;
            count++;
        }
        int power=(int) Math.pow(10,count);
        int right=square%power;
        int left=square/power;
        if((left+right)==temp){
            System.out.println("kaprekar number");
        }else{
            System.out.println("not a karpekar number");
        }
    }
}
