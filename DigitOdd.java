import java.util.Scanner;

public class DigitOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int temp = i;
            int digit_count = 0;

            while (temp != 0) {
                temp /= 10;
                digit_count++;
            }

            if (digit_count % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of numbers :" + count);
    }
}