package forLoop;

import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {

        // For döngüsü  :  belli sayıda bir işlem tekrarlanacaksa bu döngü kullanılır.

      /*  for(int i = 1; i<=100;i++){
            if(i%10==0){
                System.out.println(i);
            }
        }*/


        // task 6 faktöriyel’in sonucu nedir?

        // 6*5*4*3*2*1 = 720

       /* int islem = 1;
        for (int i = 6; i > 0 ; i--) {

            islem = islem * i;      //islem = 1 * 6       1. döngü sonucunda islem => 6
                                  // islem = 6 * 5         2. döngü sonucunda islem => 30
                                    // islem = 30 * 4       3. döngü sonucunda islem => 120
                                //islem = 120 * 3              4. döngü sonucunda islem => 360
                                //islem = 360 * 2              5. döngü sonucunda islem => 720
                                //islem = 720 * 1              6. döngü sonucunda islem => 720
        }

        System.out.println("Sonuc = "+islem);*/


        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        //yazınız.

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz.");
        int sayi = scan.nextInt();

        int TekSonuc = 0;
        int ÇiftSonuc = 0;
        for (int i = 0; i <= sayi ; i++) {
       if(i%2==0){
           ÇiftSonuc += i; // += ifadesi sağında kalan değeri solundaki değere EKLER  :  ÇiftSonuc = ÇiftSonuc + i;
       }else if(i%2==1){
           TekSonuc +=i;
       }

        }
        System.out.println("Tek sayılar toplamı : "+TekSonuc);
        System.out.println("Çift sayılar toplamı : "+ÇiftSonuc);
*/

      /*  for (char i = 'a'; i <='z' ; i++) {
            System.out.println(i);
        }*/

        // task : 9 un 1 den 10 a kadar çarpım tablosunu yazdır

     /*   for (int i = 1; i <= 10 ; i++) {

            int sonuc = 9 * i;
            System.out.println("9 * "+i+" = "+sonuc);


        }*/

// yanyana 6 adet 1 yazsın  ve bu satırdan alt alta toplam 6 adet olsun
// 111111


        //******
        //*****
        //****
        //***
        //**
        //*


      /*  for (int i = 6; i >0 ; i--) {

            for (int j =1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }*/


     /*   for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6 - i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }*/


        /*

        * 4321
        * 321
        * 21
        * 1
        *
        * */

      /*  for (int i = 0 ; i < 4 ; i++) {
            for (int j = 4 ; j > i ; j--) {
                System.out.print(j-i); // 4 3 2 1
                                       // 0 1 2 3 4
            }
            System.out.println();
        }*/

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        int number = 1;

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j < i+1 ; j++) {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();

        }





    }
}
