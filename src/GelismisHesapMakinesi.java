import java.util.Scanner;

public class GelismisHesapMakinesi {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int select;
        String menu = """
                1- Toplama işlemi
                2- Çikarma işlemi
                3- Çarpma işlemi
                4- Bölme işlemi
                5- Üslü sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }

    static void plus() {

        System.out.print("Kaç adet sayı gireceksiniz..");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {

        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {

        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {

        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {

        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {

        System.out.print("sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {

        System.out.print("Birinci değeri giriniz :");
        int number1 = scan.nextInt();
        System.out.print("ikinci değeri giriniz :");
        int number2 = scan.nextInt();

        if (number2 == 0) {
            System.out.println("ikinci değer sıfırdan farklı olmali.");
        }
        int result;
        result = number1 % number2;

        System.out.println("Sonuç : " + result);

    }

    static void rectangle() {
        System.out.print("Birinci kenarı giriniz :");
        int number1 = scan.nextInt();
        System.out.print("ikinci kenarı giriniz :");
        int number2 = scan.nextInt();

        if (number1 == 0 || number2 == 0) {
            System.out.println("Kenarlar sıfırdan farklı olmak zorunda");
        }
        System.out.println("Çevre : " + (2 * (number1 + number2)));
        System.out.println("Alan : " + (number1 * number2));
    }
}
