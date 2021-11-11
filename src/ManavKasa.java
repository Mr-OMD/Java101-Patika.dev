import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        System.out.print("Armut kaç kilo? : ");
        double armutKG = in.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        double elmaKG = in.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        double domatesKG = in.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        double muzKG = in.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKG = in.nextDouble();
        double toplam = ((armutKG*armut)+(elma*elmaKG)+(domates*domatesKG)+(muz*muzKG)+(patlicanKG*patlican));
        System.out.println("Toplam Tutar: "+toplam+" TL");
    }
}
