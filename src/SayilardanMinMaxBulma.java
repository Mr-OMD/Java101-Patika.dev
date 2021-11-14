import java.util.Scanner;

public class SayilardanMinMaxBulma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç dene sayı gireceniz yigenim? : ");
        int n = in.nextInt();

        System.out.print("Sayıyı Giriniz: ");
        int sayi = in.nextInt();
        int min = sayi;
        int max = sayi;

        do {
            System.out.print("Sayıyı Giriniz: ");
            sayi = in.nextInt();
            if (sayi > max)
                max = sayi;
            else if (sayi < min)
                min = sayi;
            n--;

        } while (n != 1);
        System.out.println("Min = " + min + "\nMax = " + max);
    }
}
