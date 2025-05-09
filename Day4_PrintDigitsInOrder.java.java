
// import java.util.Scanner;

// public class order {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         String digits=Integer.toString(n);
//         for(int i=1;i<=digits.length();i++){
//             System.out.println(i);
//         }
//     }
// }
import java.util.Scanner;

public class PrintDigitsInOrder.java

 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        int reversed = 0;
        // int temp = num;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);

        while (reversed > 0) {
            System.out.println(reversed % 10);
            reversed /= 10;
        }
    }
}
