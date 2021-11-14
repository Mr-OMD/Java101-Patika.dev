import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = in.nextInt();
        int temp = sayi;
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = 0; k < ((temp * 2) - 1); k++)
                System.out.print("*");
            temp--;
            System.out.println("");
        }
    }
}
