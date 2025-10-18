package ifElse;

import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {

        Random random = new Random(); // sistemin random bir sayı atamasını sağlar.
        double sayi1 = random.nextInt(9)+1;
        double sayi2 = random.nextInt(9)+1;
        // + - * /
        System.out.print("Lütfen kendinizi denemek istediğiniz işlemin işaretini giriniz : ");
        Scanner scan = new Scanner(System.in);
        String isaret =scan.nextLine();

        double sonuc=0;

        if(isaret.equals("+")){
            sonuc = sayi1 + sayi2 ;
        }
        else if(isaret.equals("-")){
            sonuc = sayi1-sayi2;
        }
        else if(isaret.equals("*")){
            sonuc = sayi1 * sayi2 ;
        }
        else if(isaret.equals("/")){
            sonuc = sayi1 / sayi2;
        }
        System.out.println(sayi1 +" "+isaret+" "+ sayi2 + " = ?");

        System.out.print("Lütfen işlem sonucunuzu giriniz : ");
            double kullanıcıSonuc = scan.nextDouble();

            if(sonuc == kullanıcıSonuc){
                System.out.println("Sonucunuz doğru");
            }else{
                System.err.println("Sonucunuz Yanlış");
            }

    }
}
