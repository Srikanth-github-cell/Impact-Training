import java.util.Scanner;

public class EvenOddDigitSum {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int digit = n % 10;  
            if (digit % 2 == 0) {
                evenSum += digit;  
            } else {
                oddSum += digit;
            }
            n /= 10;  
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);

    }
}