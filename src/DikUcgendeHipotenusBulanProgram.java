import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        double a = in.nextDouble();
        System.out.print("2. Kenarı Giriniz: ");
        double b = in.nextDouble();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+c);
        double u = (a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+alan);
    }
}
