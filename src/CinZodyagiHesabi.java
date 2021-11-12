import java.util.Scanner;

public class CinZodyagiHesabi {
    public static void main(String[] args) {
        String burc;
        Scanner in = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int mod = in.nextInt() % 12;
        burc = switch (mod) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Hata";
        };
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
