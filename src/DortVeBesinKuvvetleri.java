import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = in.nextInt();
        int k = 1;
        for (int i = 1; i <= sayi; i *= 4, k *= 5) {
            if (k > sayi)
                k /= 5;
            System.out.println(i + " dördün katı, " + k + " beşin katıdır.");
        }

    }
}
