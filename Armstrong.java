import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int original = n;      
        if(n>999&&n<10000){
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            int power = (int) Math.pow(r, 4);  
            sum += power;
            n /= 10;
        }
    
   
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        
    }else{
        System.out.println("invalid number");
    }
}
}
