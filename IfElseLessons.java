package ifElse;

import java.util.Locale;
import java.util.Scanner;

public class IfElseLessons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89
        // almıştır. Bu değerleri konsoldan kullanıcıya girdirin.
        //1-Ortalama sınıf geçme notu 80 ve üzeri olduğuna göre Ali’nin sınıfı geçti ise
        //ekrana true geçmedi ise false yazdırın.
        //2-Ortalama sınıf geçme notu 80 üzeri olduğuna göre Ali’nin sınıfı geçti ise
        //ekrana true geçmedi ise false yazdırın.
        //3-Ali’nin ortalama notu 80 ise ekrana true değil ise false yazdırın.
        //4. Ali’nin ortalama notu 80 eşit değil ise false değil ise true yazdırın.
        //System.out.println("Fizik notunu giriniz: ");
        //double fiziknot = scan.nextDouble();
        //System.out.println("Kimya notunu giriniz: ");
        //double kimyanot = scan.nextDouble();
        //System.out.println("Matematik notunu giriniz: ");
        //double matnot = scan.nextDouble();

        //if((fiziknot + kimyanot+ matnot)/3>= 80 ) {
        //System.out.println("Seneyi gectiniz tebrikler!!!");}
        //else if ((fiziknot + kimyanot+ matnot)/3< 80) {
        //System.out.println("Seneyi gecemediniz :( ");
        //.equals //.toLowerCase() // Random random = new Random(); sistemin random sayi atmasini saglar {random.nexint("sayi") bu sayi da sinirlandiriyor}
        String name = "mithat";
        String surname = "duman";
        int yas = 21;
        String cinsiyet = "erkek";

        System.out.println("Isminizi giriniz: ");
        String name2 = scan.nextLine();
        name2 = name2.toLowerCase();
        System.out.println("soyadinizi giriniz: ");
        String surname2 = scan.nextLine();
        surname2 = surname2.toLowerCase();
        System.out.println("Yasinizi giriniz: ");
        int yas2 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz: ");

        String cinsiyet2 = scan2.nextLine();
        cinsiyet2 = cinsiyet2.toLowerCase();

        if (name2.equals(name) && surname2.equals(surname) && yas2 == yas && cinsiyet2.equals(cinsiyet)) {
            System.out.println("tum bilgiler dogru");

        }
        if (surname2.equals(surname) && yas2 == yas && cinsiyet2.equals(cinsiyet)) {
            System.out.println("tum bilgiler dogru");


        }

        if (name2.equals(name) && surname2.equals(surname) && yas2 == yas && cinsiyet2.equals(cinsiyet)) {
            System.out.println("tum bilgiler dogru");
        }




    }
}