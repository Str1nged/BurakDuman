package ifElse;

import java.util.Random;
import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // kullanıcıdan sayı ve işlem işareti al sonrasında bu işlemi kullanıcının ekranına yansıt
        // kullanıcıdan bu işlemi zihinden yapmasını ve geri input olarak girmesini iste
        //gerçek sonuc ve kullanıcın hesapladığı sonucu kıyasla doğru iser TRUE yanlış ise FALSE yazdır.
        //System.out.println("Birinci sayiyi giriniz: ");
        //double sayi1 = scan.nextInt();
        //System.out.println("Ikinci sayiyi giriniz: ");
        //double sayi2 = scan.nextInt();
        //System.out.println("Lutfen islemi secin: ");
        // islem isareti
        //Scanner scan2 = new Scanner(System.in);
        //String islem = scan2.nextLine(); // islem isareti alindi
        //double sonuc = 0;
        //double kullanicitahmin = scan.nextDouble();
        //if (islem.equals("+")) {
          //  sonuc = sayi1+sayi2;
        //} else if (islem.equals("-")) {
          //  sonuc = sayi1 - sayi2;

        //} else if (islem.equals("*")) {
        //sonuc = sayi1 * sayi2;
        //} else if (islem.equals("/")) {
           // sonuc = sayi1 / sayi2;

        /*Random random = new Random(); // sistemin random bir sayı atamasını sağlar.
        double sayi1 = random.nextInt(9)+1;
        double sayi2 = random.nextInt(9)+1;
        // + - * /
        System.out.print("Lütfen kendinizi denemek istediğiniz işlemin işaretini giriniz : ");
        Scanner scan = new Scanner(System.in);
        String isaret =scan.nextLine();

        double sonuc=0;

        if(isaret.equals("+")){
            sonuc = sayi1 + sayi2 ;
        }
        else if(isaret.equals("-")){
            sonuc = sayi1-sayi2;
        }
        else if(isaret.equals("*")){
            sonuc = sayi1 * sayi2 ;
        }
        else if(isaret.equals("/")){
            sonuc = sayi1 / sayi2;
        }
        System.out.println(sayi1 +" "+isaret+" "+ sayi2 + " = ?");

        System.out.print("Lütfen işlem sonucunuzu giriniz : ");
        double kullanıcıSonuc = scan.nextDouble();

        if(sonuc == kullanıcıSonuc){
            System.out.println("Sonucunuz doğru");
        }else{
            System.err.println("Sonucunuz Yanlış");
                                                   }

        */
    Random random = new Random();
    double sayi1 = random.nextInt(9);           //+1 SEBEBI 0 GELMEMESI ICIN
    double sayi2 = random.nextInt(9);
    if (sayi1 == 0) {
        sayi1 += 0 ;                                   //+=1  1 ekle
    }
    if (sayi2 == 0 ) {
        sayi2 += 1 ;
    }

    double sonuc = 0;
    System.out.println("lutfen kendinizi denemek istediginiz islemi secin:");
    String isaret = scan.nextLine();



    if (isaret.equals("+")) {
        sonuc = sayi1 + sayi2;

    } else if (isaret.equals("-")) {
        sonuc = sayi1 - sayi2;
    } else if (isaret.equals("*")) {
        sonuc = sayi1 * sayi2;
    } else if (isaret.equals("/")) {
        sonuc  = sayi1 / sayi2 ;

    }
    System.out.println(sayi1 + isaret + sayi2 + " kactir?");
    double kullanicisonuc = scan.nextDouble();

    if (sonuc == kullanicisonuc){
        System.out.println("dogru bildiniz!!!");
    } else {
        System.err.println("bilemediniz :)");
    }



    }


}

