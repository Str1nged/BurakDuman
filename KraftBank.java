package odevler;

import java.util.Random;
import java.util.Scanner;

public class KraftBank {
    int customerId;
    String customerFullName;
    int isSMS;
    int customerAccount;
    String customerToken;


    public KraftBank(int musteriNo , String musterismi , int ismesaj ,  int musteriBakiye) {

    this.customerId = musteriNo;
    this.isSMS = ismesaj;
    this.customerAccount = musteriBakiye;
    }

    private void setcustomerToken (int musteriNo, String musterismi , String musteriToken) {
        this.customerId =  musteriNo;
        this.customerFullName = musterismi;
        this.customerToken = musteriToken;
        Random rand = new Random();
        int randomNumber = rand.nextInt((9999 - 1000)+1);
        String strno = String.valueOf(musteriNo);
        String customerId2 = strno.substring(0,2);
        String customername = musterismi.substring(0,2);
        musteriToken = customerId2 + customername + randomNumber;

    }
    public int paracek() {
        int newBakiye;
        int bakiye = 0;
        this.customerAccount =
        this.customerAccount = bakiye;
        System.out.println("CEKMEK ISTEDIGINIZ TUTARI GIRINIZ!!!");
        Scanner scan = new Scanner(System.in);
        int yatirilacak = scan.nextInt();
        newBakiye = customerAccount + yatirilacak;

        return newBakiye;





    }



}
