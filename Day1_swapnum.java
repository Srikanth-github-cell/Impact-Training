public class swapnum{
   public static void main(String[] args) {
       
 
        int a=4;
        int b=5;

        b=a^b;
        a=a^b;
        b=a^b;
        System.out.println(a);
        System.out.println(b);
    }
} 
