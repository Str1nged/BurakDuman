package ifElse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {

   // Scanner scan = new Scanner(System.in);
        // && ve ISARETI || VEYA ISARETI
        //Ödev:
        //Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
        //hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
        //toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
        //arasında ise ekrana true yazdırın;

        /*System.out.print("Lutfen arac fiyatini giriniz: ");
        double aracfiyat = scan.nextDouble();
        System.out.println();

        System.out.print("Lutfen kdv miktarini giriniz: ");
        double kdv = scan.nextDouble();
        System.out.println();

        System.out.print("Lutfen otv miktarini giriniz: ");
        double otv = scan.nextDouble();
        System.out.println();

        double aracfiyatkdvli = aracfiyat + (aracfiyat/100*kdv);
        double aracsonfiyat =  aracfiyatkdvli + (aracfiyatkdvli/100*otv);
        System.out.println(aracsonfiyat + "TL");

        if( aracsonfiyat <= 1000000 && aracsonfiyat >= 700000 ){
            System.out.println("True ");
        }
        else  {
            System.out.println("False ");
        }
        */
        //Scanner sınıfını kullanarak kullanıcıdan önce String türünde kullanıcının ismini alın ardından
        //double türünde 0-100 arasında 3 sayı alın ;
        //Bu verileri kullanarak
        //1. 2. 3. 4. Ortalama 70 ile 80 arasında ise ekrana true;
        //Ortalama 80 ve üzeri ile 90 arasında ise false;
        //90 ve üzeri 100 arasında ise true;
        //Tam 100 ise ekrana false yazdırın.
                                                                            // && ve  || veya
        Scanner scan = new Scanner(System.in);
        /*
        System.out.print("Lutfen kullanici adinizi girin: ");
        String kullaniciadi = scan.next();
        System.out.println();

        System.out.println("Lutfen 0-100 arasinda 1. sayiyi giriniz: ");
        double sayi1 = scan.nextDouble();
        System.out.println();

        System.out.println("Lutfen 0-100 arasinda 2. sayiyi giriniz ");
        double sayi2 = scan.nextDouble();
        System.out.println();

        System.out.println("Lutfen 0-100 arasinda 3. sayiyi giriniz: ");
        double sayi3 = scan.nextDouble();

        double ortalama = (sayi1 + sayi2 + sayi3)/3;

        if (ortalama <80 && ortalama>70 ){
            System.out.println("true");
        }
        else if (ortalama >=80 && ortalama <90) {
            System.err.println("false");
        }
        else if (ortalama>=90 && ortalama <100) {
            System.out.println("true");
        }
        else if (ortalama ==100) {
            System.out.println("False");
        }
        else if (ortalama <=70) {
            System.out.println("Daha buyuk sayilar giriniz.");
        }
        else {
            System.out.println("Lutfen 100 den buyuk sayi girmeyiniz.");
        }


        //kullanicidan bir sayi al sayi cift ise ekrana cift tek ise tek yazdir
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println();

        if ( sayi1 % 2 == 1 ) {
            System.out.println( sayi1 + " sayisi"+  " tek sayidir!");
        }
        else if (sayi1 % 2 == 0) {
            System.out.println( sayi1 + " sayisi "+ " cift sayidir" );
        }

         */
        //Öğrencinin vize notunun %30'unu final notunun %70'ini alalım.
        //Vize ve final notunun toplamından doğan not ortalaması eğer 0-30 aralığındaysa KALDINIZ (FF) yazdıralım.
        //31-49 aralığındaysa DC - KOŞULLU yazdıralım.
        //50- 84 aralığındaysa CC - GEÇTİNİZ! yazdıralım.
        //85-100 aralığındaysa Notunuz AA yazdıralım.
        System.out.print("Sinava girdiniz mi? (evet/hayir)");
        String yanit = scan.next();
        System.out.println();
        yanit = yanit.toLowerCase();
        if (yanit.equals("evet")) {

            System.out.print("Lutfen vize notunuzu giriniz: ");
            double vize = scan.nextDouble();
            System.out.println();

            System.out.print("Lutfen vize notunuzu giriniz: ");
            double finalnot = scan.nextDouble();
            System.out.println();
            double ortalama = (vize * 30/100) + (finalnot* 70/100);
            if (ortalama <= 30 && ortalama >=0){
                System.out.println("KALDINIZ (FF)");
            }

            else if (ortalama >=31 && ortalama <=49){
                System.out.println("KOSULLU GECTINIZ (DC)");
            }
            else if (ortalama >=50 && ortalama <=84) {
                System.out.println("GECTINIZ (CC)");
            }
            else if (ortalama >= 85 && ortalama <=100) {
                System.out.println("NOTUNUZ (AA)");
            }
            else {
                System.out.println("HATALI NOT GIRDINIZ!!!");
            }

        }
        else if (yanit.equals("hayir")){
            System.out.println("Lutfen once sinava giriniz!!! ");
        }
        else {
            System.err.println("Lutfen duzgun cevap veriniz!!! ");
        }









    }
}
