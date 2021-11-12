import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String uNick = in.nextLine();
        System.out.print("Şifre: ");
        String uPwd = in.nextLine();
        String Nick="patika",pwd="123";
        if(uNick.equals(Nick)&&uPwd.equals(pwd))
            System.out.println("Giriş Yaptınız!!!");
        else{
            System.out.println("Yanlış giriş yaptınız!!!");
            System.out.println("Şifre değiştirmek ister misiniz?(y/n)");
            String cvp = in.nextLine();
            if(cvp.equals("y")){
                System.out.println("Yeni şifre giriniz: ");
                uPwd=in.nextLine();
                System.out.println("Yeni şifrenizi tekrar giriniz: ");
                String cntrl=in.nextLine();
                if(cntrl.equals(uPwd)){
                    System.out.println("Şifre değiştirildi!");
                    pwd=cntrl;

                    System.out.print("Kullanıcı Adı: ");
                    uNick = in.nextLine();
                    System.out.print("Şifre: ");
                    uPwd = in.nextLine();
                    if(uNick.equals(Nick)&&uPwd.equals(pwd))
                        System.out.println("Giriş Yaptınız!!!");
                    else
                        System.out.println("çıkış yapılıyor...");
                }
                else
                    System.out.println("şifreler uyuşmuyor!!!");

            }
            else
                System.out.println("çıkış yapılıyor...");
        }


    }
}
