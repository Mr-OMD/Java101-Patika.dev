import java.util.Scanner;

public class YildizIleElmasSekli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = in.nextInt();

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < (sayi - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i + 1); k++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i = sayi; i >= 0; i--) {
            for (int j = 0; j < (sayi - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i + 1); k++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
