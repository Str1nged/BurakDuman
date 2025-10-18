package OOP;

import java.util.Scanner;

public class QNB {

    String ad;
    String soyad;
    double bakiye;
    boolean doğrulama;
    String şifre;


    //para çekme //  para yatırma // bakiye sorgulama // doğrulama
    public QNB(String name,String surname,double money,String password,boolean verification){
        this.ad=name;
        this.soyad=surname;
        this.bakiye=money;
        this.doğrulama=verification;
        this.şifre=password;

        System.out.println("Doğrulama işleminden sonra işlemlere devam edebilirsini.");

        doğrulama();
    }

    public void paraCekme(double cekilecekMiktar){

        if(cekilecekMiktar<this.bakiye){
            this.bakiye = this.bakiye - cekilecekMiktar;
            System.out.println("Hesabınızdan "+cekilecekMiktar+" kadar para çekilmiştir. Hesabınızda "+this.bakiye+ " kadar para kalmıştır." );
        }else{
            System.out.println("Bakiyeden fazla bir miktar çekmeye çalıştınız.");
        }

    }

    public void paraYatırma(double yatırılacakMiktar){
        this.bakiye = this.bakiye + yatırılacakMiktar;
            System.out.println("Hesabınıza "+yatırılacakMiktar+" Euro yatırılmıştır. Hesabınızdaki yeni bakiye : "+this.bakiye+" Euro");
    }

    public void bakiyeSorgulama(){
        System.out.println("Hesabınızda "+this.bakiye+" Euro para vardır.");
    }

    public void sifreDegistirme(String yeniSifre){

        this.şifre=yeniSifre;
    }

    public void sifreGor(){

        System.out.println(this.şifre);
    }




    public boolean doğrulama(){
        Scanner scan = new Scanner(System.in);
        boolean doğrulamaDeğeri=false;
        System.out.println("Lütfen şifrenizi giriniz : ");
        String inputSifre=scan.nextLine();

        if(inputSifre.equals(this.şifre)){
            doğrulamaDeğeri=true;
        }else{
            System.out.println("Yanlış şifre girdiniz.");
        }
        return doğrulamaDeğeri;
    }










}
