import java.util.Scanner;
public class HesapMakinesiSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double ilk = in.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double ikinci = in.nextDouble();
        System.out.println("İşlem Seçiniz:\n1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        System.out.print("İşlem Seçiniz: ");
        int secim = in.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç: "+(ilk+ikinci));
                break;
            case 2:
                System.out.println("Sonuç: "+(ilk-ikinci));
                break;
            case 3:
                System.out.println("Sonuç: "+(ilk*ikinci));
                break;
            case 4:
                if(ikinci!=0.0)
                    System.out.println("Sonuç: "+(ilk/ikinci));
                else
                    System.out.println("Sayı sıfıra bölünemez!!!");
                break;
            default:
                System.out.println("Yanlış Seçim yaptınız!");
                break;
        }
    }
}
