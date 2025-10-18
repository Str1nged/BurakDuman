package ifElse;

import java.util.Scanner;

public class İfElseLesson {

    public static void main(String[] args) {

     /*   int sayi1 = 15;
        int sayi2 = 8;
        // iki sayıyı kıyasla büyük olanı ekrana yazdır. eşitse ekrana bu iki sayı eşittir mesajı yazdır.

        if(sayi1 > sayi2){  // 15 > 8 = true
            System.out.println(sayi1);
            System.out.println("1. if blok");
        }
            else if(sayi2 > sayi1) {
            System.out.println(sayi2);
            System.out.println("2. if blok");
        }else{
            System.out.println("Bu iki sayi eşittir.");
            System.out.println("3. if blok");
        }*/


        // değil ise
        //   == eşitse
        //   != eşit değilse / değilse

        //ort != 80
        //4. Ali’nin ortalama notu 80 eşit değil ise false değil ise true yazdırın.

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Mat 1. sınav notunuzu giriniz : ");
        double not1 = scan.nextDouble();
        System.out.println("Mat 2. sınav notunuzu giriniz :");
        double not2 = scan.nextDouble();
        System.out.println("Mat 3. sınav notunuzu giriniz : ");
        double not3 = scan.nextDouble();

        double ort = (not1 + not2 + not3)/3;

        if(ort != 80){  // 80 != 80 => false
            System.out.println("if kod çalıştı");
        }else if(ort > 80){
            System.out.println("1.else if");
        }
        else if(ort < 80){
            System.out.println("2.else if");
        }else{
            System.out.println("else kod çalıştı");
        }
        System.out.println(" if else dışı");*/


        String isim = "mithat";
        String soyisim ="duman";
        String cinsiyet = "erkek";
        int yas = 21;

        Scanner scan = new Scanner(System.in);
        //Scanner scan2 = new Scanner(System.in);

        System.out.println("Lütfen Adınızı giriniz : ");
        String userName = scan.nextLine();
        userName = userName.toLowerCase();
        System.out.println("Lütfen Soyadınızı giriniz : ");
        String userSurname = scan.nextLine();
        userSurname = userSurname.toLowerCase();
        System.out.println("Lütfen cinsiyetinizi giriniz : ");
        String gender = scan.nextLine();
        gender = gender.toLowerCase();
        System.out.println("Lütfen yaşınızı giriniz : ");
        int age = scan.nextInt();
        // isim yanlış olabilir // soyisim yanlıs olabilir // cinsiyet yanlıs olabilir // yas yanlıs olabilir



        if(isim.equals(userName) && soyisim.equals(userSurname) && cinsiyet.equals(gender) && yas==age){
            System.out.println("Giriş bilgileriniz doğru.");
        }
        if(!isim.equals(userName)){
            System.err.println("İsim bilginizi yanlış girdiniz.");
        }
        if(!soyisim.equals(userSurname)){
            System.err.println("Soyisim bilginizi yanlış girdiniz.");
        }
        if(!cinsiyet.equals(gender)){
            System.err.println("Cinsiyet bilginizi yanlış girdiniz.");
        }
        if(yas != age){
            System.err.println("Yas bilginizi yanlış girdiniz.");
        }

    }
}
