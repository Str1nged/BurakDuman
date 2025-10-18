package tryCatch;

import java.util.Scanner;

public class NegatifFaktoriyel {
    public static void main(String[] args) {

while(true){

    try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktoriyel hesaplanacakk sayıyıy girin : ");
        double sayı = scan.nextDouble();
        double sabit =1;

        if(sayı==0){
            System.err.println("Program kapatılıyor ! ");
            break;
        }

        if(sayı<0){
            sabit = 0/0;
        }

        for (double i = 1; i <= sayı ; i++) {
            sabit = sabit * i ;
        }
        System.out.println("Sonuç = " + sabit);

    }catch(Exception e){

        System.out.println("Yanlış bir sayı girdiniz.");

    }


}




    }
}
