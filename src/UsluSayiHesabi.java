import java.util.Scanner;

public class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int sayi = in.nextInt();
        System.out.print("Üs olacak sayı: ");
        int us = in.nextInt();
        int toplam = 1;

        for (int i = 1; i <= us; i++)
            toplam *= sayi;

        System.out.println(sayi + " üzeri " + us + " = " + toplam);
    }
}
