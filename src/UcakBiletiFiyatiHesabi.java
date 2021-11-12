import java.util.Scanner;

public class UcakBiletiFiyatiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mesafe giriniz(KM): ");
        double mesafe = in.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int yas = in.nextInt();
        System.out.print("Yolculuk Tipini giriniz (1=>Tek Yön , 2=>Gidiş-Dönüş): ");
        int tip = in.nextInt();
        if (tip < 1 || tip > 2 || yas < 1 || mesafe < 0.1)
            System.out.println("Hatalı değer girdiniz!!!");
        else {
            double tutar = mesafe * 0.10;
            if (yas < 12)
                tutar -= tutar * 0.50;
            else if (yas <= 24)
                tutar -= tutar * 0.10;
            else if (yas >= 65)
                tutar -= tutar * 0.30;
            if (tip == 2)
                tutar = 2 * (tutar - (tutar * 0.20));
            System.out.println("Toplam Tutar = " + tutar + " TL");

        }
    }
}
