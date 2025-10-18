package OOP;

import java.util.Scanner;

public class KullaniciBilgileri {
    // kullanicidan telefion numarasi isim soyisim mail adresi dogum yili yasina git  al bilgileri ekrana yazdir


    String isim;
    String soyisim;
    String telno;
    String mail;
    String dogumyili;

    public KullaniciBilgileri () {
        this.isim = isim;

        System.out.println("LUTFEN telefion numarasi isim soyisim mail adresi dogum yili GIRINIZ!!!");
        Scanner Scan = new Scanner(System.in);
        String metin =Scan.nextLine();
        String [] list =  metin.split(",");
        this.isim=list[1];
        this.soyisim=list[2];
        this.telno=list[0];
        this.mail=list[3];
        this.dogumyili=list[4];
    }



    public void Kullanicibilgiveyasi (){

       int sayi = Integer.parseInt(this.dogumyili.trim()) ;
       int yashesabi = 2025 - sayi;
        System.out.println("KULLANICI BILGILERINIZ: "+this.isim+"\n "+this.soyisim+ "\n" +this.mail + "\n" +this.telno+ "\n"+ "VE HESAPLANAN YASINIZ "  + yashesabi);












    }






}
