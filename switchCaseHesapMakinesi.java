package methods;


import java.sql.SQLOutput;
import java.util.Scanner;

public class switchCaseHesapMakinesi {
    public static void main(String[] args) {

        boolean islemDevam = true;

        while(islemDevam){
            System.out.println("Çıkış için X e basınız.");
            System.out.println("HOSGELDINIZ LUTFEN ISLEM YAPMAK ISTEDIGINIZ 1. SAYIYI GIRINIZ: ");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String sayi1 = scan.nextLine();

            if(sayi1.toLowerCase().equals("x")){
                System.out.println("BB");
                break;

            }
                double yeniSayi1 = Double.parseDouble(sayi1);

            System.out.println("LUTFEN 2. SAYIYI GIRINIZ: ");
            double sayi2 = scan.nextInt();

            System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMIN NUMARASINI TUSLAYIN:" +
                    "TOPLAMA ICIN 1, CIKARMA ICIN 2, CARPMA ICIN 3, BOLME ICIN 4, ");

            Scanner scan2 = new Scanner(System.in);

            int ISLEM = scan2.nextInt();
            switch (ISLEM) {
                case 1:
                    System.out.println("Yapmak istediginiz islem TOPLAMA " + "GIRDIGINIZ SAYILARIN TOPLAMI: " + (yeniSayi1+sayi2) );
                    break;

                case 2:
                    System.out.println("Yapmak istediginiz islem CIKARTMA " + "GIRDIGINIZ SAYILARIN FARKI: " + (yeniSayi1 - sayi2) );
                    break;

                case 3:
                    System.out.println("Yapmak istediginiz islem CARPMA " + "GIRDIGINIZ SAYILARIN CARPIMI: " + (yeniSayi1 * sayi2) );
                    break;

                case 4:
                    if (sayi2 ==  0) {
                        System.err.println("bolme islemi icin 2. sayi 0 a esit olamaz");
                        break;
                    }

                default :
                    System.err.println("Seçtğiniz işlem yok.");

            }



        }






    }
}