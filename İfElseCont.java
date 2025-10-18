package ifElse;

import java.util.Scanner;

public class İfElseCont {

    public static void main(String[] args) {

        // aynı anda kontrol etmemiz gereken durumlar varsa if else yapısı nasıl kurulmalı ?


        // ve bağlacı       And Gate  :  &&

        // sayı1 sayı2 den büyükse ve sayi2 0 a eşitse ekrana true yazdır.
       /* int sayı1 = 1000;
        int sayı2 = 1 ;

        if(sayı1>sayı2 && sayı2 == 0  ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/


        // Veya Bağlacı       Or Gate   : ||

      /*  // sayi3 sayi4'den küçük eşit veya sayi3 0 o değilse ekrana true yazdır.
        int sayi3 = 0;
        int sayi4 = -1;

        if(sayi3 <= sayi4 || sayi3 != 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }*/

        //Ödev:
        //Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
        //hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
        //toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
        //arasında ise ekrana true yazdırın;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen arabanın fiyatını giriniz : ");
        double arabaFiyat = scan.nextDouble();
        System.out.println();
        System.out.print("Lütfen KDV miktarını giriniz (örn: 0,18) : ");
        double kdv = scan.nextDouble();
        System.out.println();
        System.out.print("Lütfen Ötv miktarını giriniz (örn: 0,20):  ");
        double otv = scan.nextDouble();
        System.out.println();
        double araçKdvEkle = arabaFiyat + (arabaFiyat*kdv);
        double toplamTutar = araçKdvEkle + (araçKdvEkle*otv);
        System.out.println("Toplam ödenecek tutar : "+toplamTutar+" TL");
        if(toplamTutar>=700000 && toplamTutar<1000000){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//tek çift sorusu
        //10 a tam bölünebilme sorusu


    }
}
