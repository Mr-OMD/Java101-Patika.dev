import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sıcaklık gir: ");
        int sicaklik = in.nextInt();

        if (sicaklik < 5)
            System.out.println("Kayak yapabilirsiniz. ");
        else if (sicaklik <= 25) {
            if (sicaklik <= 15)
                System.out.println("Sinemaya gidebilirsiniz. ");
            if (sicaklik >= 10)
                System.out.println("Piknik yapabilirsiniz. ");
        } else
            System.out.println("Yüzmeye gidebilirsiniz. ");

    }
}
