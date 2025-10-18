package methods;

import java.util.Scanner;

public class cikartmaSinifi {


    public static int cikartmaİslemi(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi girin : ");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen 2. sayiyi girin : ");
        int sayi2 = scan.nextInt();

        int sonuc = sayi1 - sayi2;

        return sonuc;

    }


}
