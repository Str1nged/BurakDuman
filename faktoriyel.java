package hatırlatma;

import java.util.Scanner;

public class faktoriyel {


    // method kendim isim verdiğim bir method

    public static int faktoriyelHesap(int faktoriyelSayisi){

        int sabit = 1;
        for (int i = 1; i <= faktoriyelSayisi ; i++) {

            sabit = sabit * i ;
        }

        return sabit ;
    }




}
