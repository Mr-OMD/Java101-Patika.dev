import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        System.out.print("Mesafe Giriniz(KM): ");
        Scanner in = new Scanner(System.in);
        double mesafe = in.nextDouble();
        double tutar = 10.0;
        double tarife = 2.20;
        tutar += tarife*mesafe;
        tutar = (tutar>20) ? tutar : 20.0;
        System.out.println("Tutar: "+tutar);

    }
}
