import java.util.Scanner;

public class HarmonikSayiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = in.nextInt();
        double toplam = 0.0;
        for (double i = 1; i <= sayi; i++)
            toplam += (1.0 / i);
        System.out.println("Harmonik Seri sayısı: " + toplam);
    }
}
