import java.util.Scanner;
public class DaireAlanVeCevreHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Yarıçap: ");
        double r = in.nextDouble();
        double pi= 3.14;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("Daire Alanı: "+alan);
        System.out.println("Daire Cevresi: "+cevre);
        System.out.print("Açı ölçüsü giriniz: ");
        double a = in.nextDouble();
        double dilimAlani = (pi*(r*r)*a)/360;
        System.out.println("Yarıçapı "+r+" olan ve merkez açı ölçüsü "+a+" olan daire diliminin alanı: "+dilimAlani);
    }
}
