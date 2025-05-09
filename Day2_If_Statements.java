
import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num<100){
             if(num<=20){
                 System.out.println("less than 20");
                if(num%2==0){
                 System.out.println("even");
                 }else{
                 System.out.println("odd");
                 }
             }else{
                 if(num%2==0){
                     System.out.println("even");
                 }else{
                     System.out.println("odd");
                  }
             }
         }else{
             System.out.println("invalid number");
        }
    }
}
