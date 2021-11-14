import java.util.Scanner;

public class MukemmelSayiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = in.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0)
                toplam += i;
        }
        if (toplam == sayi)
            System.out.println(sayi + " Mükemmel sayidir");
        else
            System.out.println(sayi + " Mükemmel sayı değildir");
    }
}
