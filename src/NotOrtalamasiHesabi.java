import java.util.Scanner;

public class NotOrtalamasiHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        int mat = input.nextInt();

        System.out.print("Fizik Notu: ");
        int fiz = input.nextInt();

        System.out.print("Kimya Notu: ");
        int kim = input.nextInt();

        System.out.print("Türkçe Notu: ");
        int tur = input.nextInt();

        System.out.print("Tarih Notu: ");
        int tar = input.nextInt();

        System.out.print("Müzik Notu: ");
        int muz = input.nextInt();

        double ortalama = (mat+fiz+kim+tur+tar+muz)/6.0;
        System.out.println("Ortalama: "+ortalama);
        String str=(ortalama>=60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
