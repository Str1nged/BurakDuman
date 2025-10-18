package scannerClass;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {

        // kullanıcıdan fahrenheit değeri al ve celcius olarak yazdır
        // C= (f-32)/1.8
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Fahrenheit değeri giriniz : ");
        double fh = scan.nextDouble();

        double celcius = (fh-32) / 1.8 ;
        System.out.println(fh + " fahrenheit = "+celcius+ " Celcius derecedir.");


    }
}
