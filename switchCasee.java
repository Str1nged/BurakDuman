package switchCase;

import java.util.Scanner;

public class switchCasee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sifre = 12345;
        int hak = 3;
        double bakiye = 100000;

        boolean durum = true;

        while (durum) {

            if (hak == 3) {
                System.out.println("Lütfen kart şifrenizi giriniz :");
            }
            int KullaniciGirisi = scan.nextInt();
            if (KullaniciGirisi == sifre) {
                System.out.println("Başarılı bir giriş yaptınız. ");
                durum = false;
            } else {
                System.err.println("Şifre yanlıştır !");
                hak = hak - 1;
                if (hak > 0) {
                    System.out.println("Şifrenizi tekrar giriniz : ");
                }
                if (hak == 0) {
                    System.err.println("Kart Şifreniz Bloke Olmuştur !");
                    break;
                }
            }
        }
        // switch case
        // para yatır // para çek // bakiye sorgulama // para gönder // şifre değiştir ...

        System.out.println("1) Para Çekme ");
        System.out.println("2) Para Yatırma ");
        System.out.println("3) Bakiye Sorgulama");
        System.out.println("4) Para Gönder ");
        System.out.println("5) Şifre Değiştir ");
        System.out.println("6) Borclarini Taksite Bol");
        System.out.println();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        int secenek = scan.nextInt(); // kullanıcıdan 1 2 3 4 5 den birini girmesini istedim.

        switch(secenek){

            case 1 :
                System.out.println("Çekmek istediğiniz miktarı giriniz : ");
                double cekilenMiktar = scan.nextDouble();
                double sonuc = bakiye - cekilenMiktar;
                System.out.println("Hesabınızda "+sonuc+" TL kalmıştır.");

                break;

            case 2 :
                System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
                double yatirilaMiktar = scan.nextDouble();
                double sonuc2 = bakiye + yatirilaMiktar;
                System.out.println("Hesabınızda "+sonuc2+" TL vardır.");
                break;

            case 3 :
                System.out.println("Hesabınızda bulunan bakiye : "+ bakiye);
                break;

            case 4 :
                System.out.println("Gondermek istediginiz hesabi giriniz ");
                long iban = scan.nextLong();
                System.out.println("Göndermek istediğiniz miktarı giriniz : ");
                double gönderilenMiktar = scan.nextDouble();
                double sonuc3 = bakiye - gönderilenMiktar;
                System.out.println("Hesabınızda "+sonuc3+" TL kalmıştır.");
                break;

            case 5 :
                System.out.println("Yeni şifrenizi giriniz :  ");
                int yeniSifre = scan.nextInt();
                System.out.println("Yeni şifreniz kaydedilmiştir.");
                break;

            case 6 :
                System.out.println("Lutfen guncel borcunuzu giriniz:");
                int borc = scan.nextInt();
                System.out.println("Kac taksit yapmak istersiniz? ");
                int taksit = scan.nextInt();
                double taksitson = borc/taksit;
                System.out.println("Aylik odemeniz " + taksitson + "TL dir");
                break;


            default:
                // eğer kullanıcı 1 2 3 4 5  den farklı bir tuşlama yaparsa
                System.out.println("Yanlış bir tuşlama yaptınız.");

        }
    }
}
