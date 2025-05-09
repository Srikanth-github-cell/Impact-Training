import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10) {
            int sum = 0;
            while (num > 0 || sum > 9) {
                if (num == 0) {
                    num = sum;
                    sum = 0;
                }
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("invalid");
        }
        
    }
}
