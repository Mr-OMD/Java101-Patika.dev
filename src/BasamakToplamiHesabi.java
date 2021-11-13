import java.util.Scanner;

public class BasamakToplamiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = in.nextInt();
        int temp = sayi;
        int toplam = 0;
        while (temp != 0) {
            toplam += temp % 10;
            temp /= 10;
        }
        System.out.println("Basamak sayıları toplamı: " + toplam);
    }
}
