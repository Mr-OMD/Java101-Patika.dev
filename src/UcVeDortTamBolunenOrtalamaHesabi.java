import java.util.Scanner;

public class UcVeDortTamBolunenOrtalamaHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double toplam = 0;
        double avg = 0;
        int count = 0;
        System.out.print("Sayı Giriniz: ");
        int sayi = in.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                toplam += i;
                count++;
            } else if (i % 4 == 0) {
                toplam += i;
                count++;
            }

        }
        avg = toplam / count;
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + avg);
        
    }
}
