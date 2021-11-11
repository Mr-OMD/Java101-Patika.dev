import java.util.Scanner;

public class KDVTutariHesabi {

    public static void main(String[] args) {
        System.out.print("Lütfen Tutar Giriniz: ");
        Scanner in = new Scanner(System.in);
        double tutar = in.nextDouble();
        double kdv = (tutar>=1000.0) ? 0.08 : 0.18;
        double toplam =tutar+ (kdv*tutar);
        System.out.println("Tutar: "+tutar+" TL");
        System.out.println("KDV: "+kdv+" TL");
        System.out.println("Toplam tutar: "+toplam+" TL");
    }

}
