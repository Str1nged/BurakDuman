package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListMethodu {

    public static void main(String[] args) {


        // verileri listelemek için kullanılır.

        List<String> isimListesi = new ArrayList<>(10);// java bu satırdan itibaren içinde 10 adet string veri tipinde değişken tutacak kadar hafıza ayırır
        isimListesi.add("enes"); // index = 0
        isimListesi.add("mithat");
        isimListesi.add("burak");
        isimListesi.add("ferhat");
        isimListesi.add("ali");
        isimListesi.add("veli");
        isimListesi.add("ahmet");
        isimListesi.add("mehmet");
        isimListesi.add("furkan"); // son elemanın index'i için  = size -1 ;  (size -1) sayıdır (integer).

       // System.out.println(isimListesi.get(3))
       // System.out.println(isimListesi.size());// kaç adet veri var.
        //System.out.println(isimListesi.get(isimListesi.size() - 1));

        List<String> tersİsimListesi = new ArrayList<>(10);

        for (int i = 1 ; i <= isimListesi.size() ; i++) {

           tersİsimListesi.add(isimListesi.get(isimListesi.size()-i));
        }
        String arananİsim="Enes";
        System.out.println(tersİsimListesi.contains(arananİsim.toLowerCase()));// senin aradığın ifade listede var .
        System.out.println(tersİsimListesi.size());
        System.out.println(tersİsimListesi);
        tersİsimListesi.remove(3); // listeden girilen  indexi siler
        System.out.println(tersİsimListesi);
        System.out.println(tersİsimListesi.size());
        tersİsimListesi.set(3,"Alex");
        System.out.println(tersİsimListesi);
        System.out.println(tersİsimListesi.indexOf("enes"));
        System.out.println(tersİsimListesi.lastIndexOf("enes"));
        System.out.println(tersİsimListesi);




/*
        System.out.println(tersİsimListesi);
        String arananİsim="aHmEt";
        int count =0;
        for (int i = 0; i <tersİsimListesi.size() ; i++) {
            if(tersİsimListesi.get(i).toLowerCase().equals(arananİsim.toLowerCase())){
                count++; // count değerini 1 arttırır.
                break;
            }
        }

        if(count==1){
            System.out.println("Bu isim listede var");
        }else if(count == 0){
            System.out.println("bu isim listede yok.");
        }*/



    }
}
