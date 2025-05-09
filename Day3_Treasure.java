import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GoldCoins = sc.nextInt();
        int benshare = sc.nextInt();
        int blackshare = sc.nextInt();

        int ben_coins = (benshare * GoldCoins) / 100;
        int rem = GoldCoins - ben_coins;
        int blackcoins = (blackshare * rem) / 100;
        int remaining = (rem - blackcoins) / 3;

        System.out.println(ben_coins);
        System.out.println(blackcoins);
        System.out.println(remaining);
    }
}
