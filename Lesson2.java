package ifElse;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        // kullanıcıdan sayı ve işlem işareti al sonrasında bu işlemi kullanıcının ekranına yansıt
        // kullanıcıdan bu işlemi zihinden yapmasını ve geri input olarak girmesini iste
        //gerçek sonuc ve kullanıcın hesapladığı sonucu kıyasla doğru iser TRUE yanlış ise FALSE yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz : ");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz : ");
        double sayi2 = scan.nextDouble();
         // işlem işareti al
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemin işaretini giriniz :");
        String islem = scan2.nextLine(); //  +   -   *   / işaretlerinden herhangi birini islem değişkenine atadım


        double sonuc=0;

        if(islem.equals("+")){
            sonuc = sayi1 + sayi2 ;
        }
        else if(islem.equals("-")){
            sonuc = sayi1-sayi2;
        }
        else if(islem.equals("*")){
            sonuc = sayi1 * sayi2 ;
        }
        else if(islem.equals("/")){
            sonuc = sayi1 / sayi2;
        }

        System.out.println(sayi1 + " "+islem + " "+sayi2 +" = ?" );

        System.out.println("Lütfen hesapladığınız işlem sonucu giriniz : ");
        double kullaniciSonuc = scan.nextDouble();

        if(sonuc == kullaniciSonuc){
            System.out.println("Hesaplamanız Doğru !!!");
        }else{
            System.err.println("Hesaplamanız YANLIŞ !!!");
            System.out.println("Doğru sonuc = " + sonuc );
        }









    }


}
