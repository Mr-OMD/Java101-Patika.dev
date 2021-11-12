import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;
        double dersSayisi=5.0;
        Scanner in=new Scanner(System.in);


        System.out.print("Matermatik Notu: ");
        mat = in.nextInt();
        if(mat>100 || mat<0){
            dersSayisi--;
            mat=0;
        }

        System.out.print("Fizik Notu: ");
        fiz = in.nextInt();
        if(fiz>100 || fiz<0){
            dersSayisi--;
            fiz=0;
        }

        System.out.print("Türkçe Notu: ");
        tur = in.nextInt();
        if(tur>100 || tur<0){
            dersSayisi--;
            tur=0;
        }

        System.out.print("Kimya Notu: ");
        kim = in.nextInt();
        if(kim>100 || kim<0){
            dersSayisi--;
            kim=0;
        }

        System.out.print("Müzik Notu: ");
        muz = in.nextInt();
        if(muz>100 || muz<0){
            dersSayisi--;
            muz=0;
        }

        double avg=(mat+fiz+tur+kim+muz)/dersSayisi;
        if(avg>=55)
            System.out.println("Sınıfı Geçtin!!");
        else
            System.out.println("Sınıfta Kaldın!!");
        System.out.println("Ortalama: "+avg);

    }
}
