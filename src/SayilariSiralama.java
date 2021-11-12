
import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1. Sayi: ");
        int bir = in.nextInt();
        System.out.print("2. Sayi: ");
        int iki = in.nextInt();
        System.out.print("3. Sayi: ");
        int uc = in.nextInt();

        if (bir > iki && bir > uc) {
            if (iki > uc)
                System.out.println(uc + " < " + iki + " < " + bir);
            else
                System.out.println(iki + " < " + uc + " < " + bir);
        } else if (iki > bir && iki > uc) {
            if (bir > uc)
                System.out.println(uc + " < " + bir + " < " + iki);
            else
                System.out.println(bir + " < " + uc + " < " + iki);
        } else if (bir > iki)
            System.out.println(iki + " < " + bir + " < " + uc);
        else
            System.out.println(bir + " < " + iki + " < " + uc);

    }
}
