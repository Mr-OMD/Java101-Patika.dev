import java.util.Scanner;

public class FibonacciHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = in.nextInt();
        int bir = 0, iki = 1, uc;
        System.out.print(bir + " " + iki);
        for (int i = 3; i <= sayi; i++) {
            uc = bir + iki;
            System.out.print(" " + uc);
            bir = iki;
            iki = uc;
        }
    }
}
