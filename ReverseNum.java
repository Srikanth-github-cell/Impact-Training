import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int reversed=0;
        System.out.println("enter 3 digit number:");
        int num=sc.nextInt();
        if(num>99&&num<=999){
            int firstdigit=num/100;
            int lastdigit=num%10;
            int middledigit=(num/100)%10;
            reversed=lastdigit*100+middledigit*20+firstdigit;
            System.out.println(reversed);
        }else{
            System.out.println("invalid number");
        }

    }
}
