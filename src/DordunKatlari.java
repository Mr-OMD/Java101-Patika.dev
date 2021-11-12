import java.util.Scanner;

public class DordunKatlari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0, n;
        do {
            System.out.print("Sayi Gir: ");
            n = in.nextInt();
            if (n % 4 == 0)
                total += n;

        } while (n > 0);
        System.out.println("Toplam: " + total);
    }
}
