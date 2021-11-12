import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yil = in.nextInt();
        if (yil % 100 == 0 && yil % 400 != 0)
            System.out.println(yil + " bir artık yıl değildir !!!");
        else if (yil % 4 == 0)
            System.out.println(yil + " bir artık yıldır !!!");
        else
            System.out.println(yil + " bir artık yıl değildir !!!");
    }
}
