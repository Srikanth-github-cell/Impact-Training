
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        System.out.println("enter 3 digit number:");
        int num=sc.nextInt();
        if(num>=100&&num<1000){
        int middle=(num/10)%10;
        
        if(middle%3==0){
            System.out.println(("trendy"));
        }else{
            System.out.println("not a trendy");
        }
    }else{
        System.out.println("invalid number");
    }
    }
}
