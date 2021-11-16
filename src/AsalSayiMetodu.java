import java.util.Scanner;

public class AsalSayiMetodu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();

        asalMi(sayi, 2);

    }

    public static boolean asalMi(int sayi, int bolen) {
        if (sayi == bolen || sayi == 1) {
            System.out.println(sayi + " sayısı ASALDIR! ");
            return true;
        }

        if (sayi % bolen == 0) {
            System.out.println(sayi + " sayısı ASAL değildir ");
            return false;
        }

        return asalMi(sayi, bolen + 1);
    }
}
