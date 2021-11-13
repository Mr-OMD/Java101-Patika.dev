import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N sayısını gir: ");
        int n = in.nextInt();
        System.out.print("R sayısını gir: ");
        int r = in.nextInt();
        int fakR = 1, fakN = 1, fakZ = 1;
        for (int i = 1; i <= n; i++)
            fakN *= i;
        for (int i = 1; i <= r; i++)
            fakR *= i;
        for (int i = 1; i <= (n - r); i++)
            fakZ *= i;
        int komb = fakN / (fakR * fakZ);
        System.out.println("C(" + n + "," + r + ") = " + komb);
    }

}
