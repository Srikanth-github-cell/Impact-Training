import java.util.Scanner;

public class AdamNum {
    
   
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int square = n * n;
        int reversed = reverse(n);
        int reversedSquare = reversed * reversed;

        int reversedSquareOfOriginal = reverse(square);

        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Square of original: " + square);
        System.out.println("Square of reversed: " + reversedSquare);
        System.out.println("Reverse of square of original: " + reversedSquareOfOriginal);

        if (reversedSquare == reversedSquareOfOriginal) {
            System.out.println(n + " is an Adam number.");
        } else {
            System.out.println(n + " is not an Adam number.");
        }
    }
}
