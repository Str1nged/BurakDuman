package OOP;

import java.util.Scanner;

public class Akbank {

    private String name;
    private String surName;
    private String accountKey;
    private String password;
    private double money;

    public Akbank(String name, String surName, String password, double money) {

        this.name = name;
        this.surName = surName;
        this.password = password;
        this.money = money;
        setAccountKey();
        System.out.println("hesap basari ile olusturuldu!");
    }

    private String setAccountKey() {
        this.accountKey = this.surName + this.password;
        return this.accountKey;

    }

    public String getName() {
        return this.name;
    }

    public String getsurName() {
        return this.surName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAccountKey() {

        return this.accountKey;
    }

    public double getmoney() {
        return this.money;
    }


    public boolean verify () {
        Scanner scan = new Scanner(System.in);
        System.out.println("SIFRENIZI GIRINIZ");
        String dogrulama = scan.nextLine();


        if (dogrulama.equals(this.password) ) {

            System.out.println("DOGRULAMA BASARILI!");

            return true;
        }
        else {
            System.out.println("sifreniz dogrulanamadi");
            return false;
        }
    }


    public void setPassword() {
        boolean dogrulama = verify();
        if(dogrulama){
            System.out.println("YENI SIFRENIZI GIRINIZ ");
            Scanner scan = new Scanner(System.in);
            String newPassword = scan.nextLine();
            System.out.println("YENI SIFRENIZ:" +newPassword );
        }
        else {
            System.out.println("ESKI SIFRE DOGRULAMANIZ HATALI!!!");
        }
    }

    public void ParaCekme(){
        boolean dogrulama = verify();

        if(dogrulama) {
            System.out.println("CEKMEK ISTEDIGINIZ TUTARI GIRINIZ!!!");
            Scanner scan = new Scanner(System.in);
            double tutar = scan.nextDouble();
            double newMoney = this.money - tutar;
            this.money = newMoney;
            System.out.println("CEKILEN MIKTAR " + tutar + " " + "GUNCEL BAKIYENIZ " + this.money);
        }
            else {
            System.out.println("SIFRE DOGRULAMANIZ HATALI!!!!");

        }
    }




}