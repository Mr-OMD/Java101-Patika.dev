import java.util.Scanner;

public class EBOBEKOKWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 Değerini Gir: ");
        int n1 = scanner.nextInt();

        System.out.print("n2 Değerini Gir:");
        int n2 = scanner.nextInt();
        int ebob = 1;

        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("2 Değerin EBOB'u: " + ebob);
        int ekok = n1 * n2 / ebob;
        System.out.println("2 Değerin EKOK'u: " + ekok);
    }
}
