import java.util.*;
public class SumFirstLastDigit.java {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number:");
         int num=sc.nextInt();
         if(num>=1000 && num<=9999){
             int lastdigit=num/1000;
            int firstdigit=num%10;
              System.out.println(firstdigit+lastdigit);
         }else{
            System.out.println("wrong number");
         }
    }
}
