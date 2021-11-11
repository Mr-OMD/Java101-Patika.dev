import java.util.Scanner;
public class VucutKitleEndeksiHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Boyunuz(Metre): ");
        double boy = in.nextDouble();
        System.out.print("Kilonuz(KG): ");
        double kilo = in.nextDouble();
        double endeks = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksiniz: "+endeks);

    }
}
