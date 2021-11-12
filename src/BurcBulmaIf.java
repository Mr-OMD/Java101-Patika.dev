import java.util.Scanner;

public class BurcBulmaIf {
    public static void main(String[] args) {
        double ay, gun, index;
        String burc;

        Scanner in = new Scanner(System.in);

        System.out.print("Doğum Ayı: ");
        ay = in.nextDouble();

        System.out.print("Doğum Günü: ");
        gun = in.nextDouble();

        index = (ay - 1) * 30 + gun;
        if (index <= 30) {
            burc = "KOVA";
        } else if (index > 49 && index <= 80) {
            burc = "BALIK";
        } else if (index > 80 && index <= 110) {
            burc = "KOÇ";
        } else if (index > 110 && index <= 142) {
            burc = "BOĞA";
        } else if (index > 142 && index <= 172) {
            burc = "İKİZLER";
        } else if (index > 172 && index <= 202) {
            burc = "YENGEÇ";
        } else if (index > 202 && index <= 232) {
            burc = "ASLAN";
        } else if (index > 232 && index <= 262) {
            burc = "BAŞAK";
        } else if (index > 262 && index <= 291) {
            burc = "TERAZİ";
        } else if (index > 291 && index <= 320) {
            burc = "AKREP";
        } else if (index > 320 && index < 350) {
            burc = "YAY";
        } else {
            burc = "OĞLAK";
        }
        System.out.println("Burcunuz: " + burc);
    }
}
