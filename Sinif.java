package OOP;

import java.util.Scanner;

public class Sinif {
    String isim ;
    String soyad ;
    String sinif ;
    String yas ;


    public Sinif(){

        System.out.println("LUTFEN ADINIZI , SOYADINIZI , SINIFINIZI VE YASINIZI GIRINIZ aralarinda !!!");
        Scanner scanner = new Scanner(System.in);
        String isim = scanner.nextLine();
        // mithat , duman, uni4 , 24
        String [] list = isim.split(",");
        this.isim = list[0];
        this.soyad = list[1];
        this.sinif = list[2];
        this.yas = list[3];

    }


    public void kullaniciBilgileri (){

        System.out.println("SIZIN BILGILERINIZ " + this.isim+" "+ this.soyad +" "+ this.yas + " "+ this.sinif );









    }





















}
