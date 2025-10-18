package OOP;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.Scanner;

public class Makine {

    String marka;
    double hacim;
    String renk;


    public Makine() {

        System.out.println("Lutfen istediginiz markayi yaziniz: ");
        Scanner scan = new Scanner(System.in);
        this.marka = scan.nextLine();
        System.out.println("Lutfen dilediginiz hacmi giriniz ml cinsinden: ");
        this.hacim = scan.nextDouble();
        System.out.println("Lutfen istediginiz rengi yaziniz: ");
        String renk = scan.nextLine();
        this.renk = renk;
        System.out.println(this.renk);
    }

    public void hacimartir() {
        System.out.println("HACMI ARTIRMAK ISTEDIGINIZ MIKTARI GIRINIZ(ML): ");
        Scanner scan = new Scanner(System.in);
        double yenihacim = scan.nextDouble();
        this.hacim = this.hacim + yenihacim;
    }

    public void hacimazalt() {
        System.out.println("HACMI AZALTMAK ISTEDIGINIZ MIKTARI GIRINIZ(ML): ");
        Scanner scan = new Scanner(System.in);
        double yenihacim = scan.nextDouble();
        if (this.hacim <= yenihacim) {
            System.err.println("HACIMSIZ BARDAK MI OLUR");
        } else {
            this.hacim = this.hacim - yenihacim;
        }


    }

    public void guncelveriler() {
        System.out.println(this.marka + " " + this.hacim + " " + this.renk);


    }


}
