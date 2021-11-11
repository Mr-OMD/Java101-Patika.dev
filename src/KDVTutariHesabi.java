import java.util.Scanner;

public class KDVTutariHesabi {

    public static void main(String[] args) {
        System.out.print("Lütfen Tutar Giriniz: ");
        Scanner in = new Scanner(System.in);
        double tutar = in.nextDouble();
        double kdv = (tutar>=1000.0) ? 0.08 : 0.18;
        double kdvTL = kdv*tutar;
        double toplam = tutar + kdvTL;
        System.out.println("Tutar: "+tutar+" TL");
        System.out.println("KDV Oranı: "+kdv);
        System.out.println("KDV Tutarı: "+kdvTL+" TL");
        System.out.println("Toplam tutar: "+toplam+" TL");
    }

}
