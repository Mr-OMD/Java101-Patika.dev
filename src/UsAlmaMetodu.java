import java.util.Scanner;

public class UsAlmaMetodu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri : ");
        int taban = scanner.nextInt();

        System.out.print("Üs değeri : ");
        int us = scanner.nextInt();

        int sonuc = usHesapla(taban, us);
        System.out.println("Sonuç : " + sonuc);
    }

    public static int usHesapla(int taban, int us) {
        if (us == 1) {
            return taban;
        }
        return taban * (usHesapla(taban, us - 1));

    }
}
