import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (num): ");
        int num = sc.nextInt();

        System.out.print("Enter the divisor (m): ");
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int lower = (num / m) * m;
            int higher = lower + m;

            int distLower = num - lower;
            int distHigher =higher - num;

            int nearest;
            if (distLower == distHigher) {
                nearest = Math.min(lower, higher); 
            } else if (distLower < distHigher) {
                nearest = lower;
            } else {
                nearest = higher;
            }

            System.out.println("Nearest integer :"+nearest);
        }

      
    }
}