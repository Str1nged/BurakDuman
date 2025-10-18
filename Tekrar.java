package tekrar;

import com.sun.corba.se.impl.ior.iiop.MaxStreamFormatVersionComponentImpl;
import com.sun.media.sound.RIFFInvalidDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {


ArrayList <String> Isimler = new ArrayList<>();
    int counter = 0;
    Isimler.add("Mithat");
    Isimler.add("Enes");
    Isimler.add("Burak");
    Isimler.add("Ferhat");
    Isimler.add("Omer");
    Isimler.add("Ali");
    Isimler.add("Jacek");
        for (int i = 0; i <= Isimler.size()-1; i++) {

            if (Isimler.get(i).equals("Enes")== true) {
                counter++;

            }
            
        }

        if (counter > 0 ){
            System.out.println("enes ismi var");
        }

        else {
            System.out.println("enes ismi yok");
        }





















    }

}






