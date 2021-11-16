import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayisi : ");
        int n = scanner.nextInt();

        desenAzalt(n, n);

    }

    public static int desenAzalt(int number, int tempNumber) {

        if (number > 0) {
            System.out.print(number + " ");
            return desenAzalt(number - 5, tempNumber);
        } else {
            return desenArttir(number, tempNumber);
        }
    }

    public static int desenArttir(int number, int tempNumber) {

        System.out.print(number + " ");
        if (number == tempNumber) {
            return number;
        } else {
            return desenArttir(number + 5, tempNumber);
        }
    }

}
