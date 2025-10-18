package OOP;

import java.util.Scanner;


public class Araclar {

    String Marka;
    int yil;
    boolean hizayarlama;
    int start;
    int stop;
    boolean durum;

    int hiz;
    public Araclar (String Marka2,int yil2) {
        this.Marka = Marka2;        // constractor method
        this.yil = yil2;
    }

    public void start (){
        System.out.println("LUTFEN ARACI CALISTIRMAK ICIN 1 E BASIN!!! ");
        Scanner scan = new Scanner(System.in);
        this.start = scan.nextInt();
        if (this.start == 1){
            System.out.println("ARAC BASARIYLA CALISTI!!!");
            this.durum = true;
            this.hiz=0;
        }
        else {
            System.err.println("YANLIS TUSLAMA ");
            start();
        }
    }

    public void hizlanma () {
        System.out.println("Ne kadar hizlanmak istediğinizi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int hiz_input = scan.nextInt();
        this.hiz = this.hiz + hiz_input;
    }


    public void yavaslama () {
        System.out.println("Ne kadar yavaslamak istediğinizi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int hizYavas_input = scan.nextInt();
        this.hiz = this.hiz - hizYavas_input;
    }
    public void stop (){
        if(this.hiz==0){
            System.out.println("LUTFEN ARACI DURDURMAK ICIN 0 E BASIN!!! ");
            Scanner scan = new Scanner(System.in);
            this.stop = scan.nextInt();
            if (this.stop == 0){
                System.out.println("MOTOR DURDURULDU !!!");
                this.durum = true;
            }
            else {
                System.err.println("YANLIS TUSLAMA ");
                stop();
            }
        }else {
            System.err.println("Lütfen öncelikle aracı yavaşlatın.");
        }
        // stop methodu : arac hızı 0 dan büyükse kullanıcı durmak istediğinden eminse araç hızı 0'a eşit olana
        // kadar kullanıcıdan yavaşlatma methodu alınsın.
        //hız 0 a eşit veya düşük olduğunda araç durdu mesajı gelsin.
        //kullanıcı geri hızlanmak isterse hızlanabilsin.

    }














}