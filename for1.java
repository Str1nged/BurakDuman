package forDongusu;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
       /* for (int a = 5; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println();

        for (int a = 0; a <= 10 ; a++ ) {
            System.out.println(a);
            a ++;
        }

        System.out.println();

      for (int a = 0; a <=100; a++){
            if (a%10 == 0){
           System.out.println(a);
         }

      }
        for(int a = 0; a <=50; a++) {
        if(a%2==1) {
            if(a <= 25){
                System.out.print(a+" ");

            }

            if(a >= 25){
             if(a== 25){
                 System.out.println();
             }

                System.out.print(a+" ");
            }
        }
        }

        for(int a = 0;a<=50; a++){
            if (a%2==0 && a%3==0){
                System.out.println(a);
            }

        } */

        // TASK: KULLANICIDAN HANGI SAYIYA KADAR OLDUGU BILGISINI AL VE BU ARALIKTAKI SAYILARIN HANGI SAYIYA
        // TAM BOLUNMESI ISTEDIGINI DE AL EKRANA BU SAYILARI ALT ALTA YAZIDIR

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sayiya kadar?");
        double ekadar = scan.nextDouble();
        System.out.println("Hangi sayiya tam bolunmesini istiyorsun?");
        double hangisayi = scan.nextDouble();
        for (double i=0; i<=ekadar;i++ ){

            if (i%hangisayi==0){

                System.out.println(i );
            }

        }

        for (int m = 100; m >= 0; m--){
            System.out.println(m);
        }


        int islem = 1;

        for (int i = 6; i > 0; i--){
            islem = islem * i ;

        }
        System.out.println(islem);



        for (int i = 20; i > 0 ; i--) {

            System.out.println(i*i*i);

        }



        for (int i = 23; i <50 ; i++)  {
            System.out.println( (i -32) / 1.8);

        }



    //Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        //sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        //ekrana yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println(" Bir kelime giriniz ");
        String kelime = scan.nextLine();
        System.out.println("Kac defa yazdirmak istiyorsunuz");
        int tekrar  = scan.nextInt();

        for (int i = tekrar; i > 0; i--) {
            System.out.println(kelime);

        }


        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //olan tamsayıların toplamını ekrana yazdıran programı yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("0 ile 1000 arasinda bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 0 ; i <= sayi ; i++) {
            toplam = toplam + i;

        }
        System.out.println(toplam);


        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        //yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("0 ile 1000 arasinda bir sayi giriniz");
        int sayi = scan.nextInt();
        int Teksonuc = 0;
        int Ciftsonuc = 0;
        for (int i = 0; i <= sayi; i++) {
            if(i %2 == 0 ) {
                Ciftsonuc += i ;
            } else if (i %2 == 1 ) {
                Teksonuc += i;

            }

        }
        System.out.println("TEK SAYILARIN TOPLAMI "+ Teksonuc);
        System.out.println("CIFT SAYILARIN TOPLAMI "+ Ciftsonuc);

         */


        //Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        //yazdıran programı yazdırınız.(2üzeri4=16)
        /*Scanner scan = new Scanner(System.in);
        System.out.println("bir taban sayisi giriniz");
        int taban = scan.nextInt();
        System.out.println("bir kuvvet sayisi giriniz");
        int kuvvet = scan.nextInt();

        // 3 uzeri 2 = 3*3
        int sonuc = 1;
        for (int i = 0; i< kuvvet; i++  ){
            sonuc = sonuc * taban ;

        }
        System.out.println(taban + " uzeri " + kuvvet+ " = " + sonuc);

        System.out.println("hangi sayinin faktoriyelini hesaplamak istersiniz ");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sonuc = 1;
        for (int i  = 1; i<= sayi1 ; i ++ ){
            sonuc = i * sonuc;
        }
        System.out.println("islemin sonucu "+sonuc);


        //Örnek: 9 sayısının çarpım tablosunu yazdırınız.
        //9 * 1 = 9
        //9 * 2 =18
        //9*3=27
        int sonuc = 1;
        for (int i = 0; i <= 10; i++) {
            sonuc = 9 * i;
            System.out.println("9 * "+ i+ " = "+ sonuc);
        }

        // 6 satir 6 adet 1

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.print("8  ");
            }

            System.out.println();
        }

        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        //kulanarak




        for (int i  = 0; i < 6 ; i ++){


            for (int j = 0; j < 6-i ; j++) {
                System.out.print("* ");
            }
            System.out.println( );


        }

        //1
        //12
        //123
        //1234
        //12345
        //123456


        for (int i = 5; i >= 0; i--) {


            for (int j = 0; j < 6 - i; j++) {
                System.out.print(j + 1+ " ");
            }
            System.out.println();


        }

        for (int i = 0; i <4 ; i++) {           //0 1 2 3
            for (int j = 4; j >i ; j--) {       //4 3 2 1
                System.out.print(j-i);
            }
            System.out.println();
        }
        //int number = 1;
        //
        //        for (int i = 1; i <=5 ; i++) {
        //
        //            for (int j = 1; j < i+1 ; j++) {
        //                System.out.print(number +" ");
        //                number++;
        //            }
        //            System.out.println();
        //
        //}

        //Ödev :
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *

        int a = 6;
        for (int x = 0; x <=a; x++) {


        for (int i = 0; i < x; i++) {
            System.out.print("* ");
        }
        System.out.println();
        }
        */
        Scanner scan = new Scanner(System.in);
        int hak = 2;
        int kartSifre = 1453;
        System.out.println("Kart sifranizi giriniz:");
        int kullanicigirisi = scan.nextInt();
        boolean durum = true;


        while (durum) {
            System.out.println("Lutfen sifrenizi giriniz:");
            int sifre = scan.nextInt();
            if (kartSifre == sifre) {
                System.out.println("Sifreniz dogru!!");
                break;

            } else {
                System.err.println("Sifreniz yanlisdir!");
                hak -= 1;
                if (hak == 0) {
                    System.out.println("Kartiniz bloke olmustur");
                    break;
                }


            }
        }


    }
}