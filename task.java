
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
        if(n%2==1){
            System.out.println("wierd");
        }
        else{
            if(n>=2&&n<6){
                System.out.println("not wierd");
            }
            if(n>5&&n<21){
                System.out.println("wierd");
            }
            if(n>20){
                System.out.println("not wierd");
            }
         }
        }else{
            System.out.println("negative number");
        }
    }
}
