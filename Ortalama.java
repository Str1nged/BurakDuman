package scannerClass;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        // fizik kimya matematik derslerinden not iste ortalamasını bul.
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Fizik ders notunuzu giriniz : ");
        double fizikNot = scan.nextDouble();
        System.out.println("Lütfen Kimya ders notunuzu giriniz : ");
        double kimyaNot = scan.nextDouble();
        System.out.println("Lütfen Matematik ders notunuzu giriniz : ");
        double matNot = scan.nextDouble();

        double ortalama = ( fizikNot + kimyaNot + matNot ) / 3 ;

        System.out.println("Derslerinizin not ortalaması : "+ortalama);



    }
}
