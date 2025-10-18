package hatırlatma;

import java.util.ArrayList;

public class TamBolunenBulma {


    public static void tamBolunenBulma (int baslangıcDeger, int bitisDeger,int bolen ) {

        String result ="";
        int sonuc = 0;

        if(bolen>bitisDeger){
            System.err.println("Bölen değeri aralık dışındadır. Tekrar giriniz.");


        }

        ArrayList<Integer> mithatList = new ArrayList<>();

        for (int i = baslangıcDeger; i <= bitisDeger ; i++) {
            sonuc = i % bolen;
            if(sonuc == 0){
                mithatList.add(i);
            }
        }

        for (int j = 0; j < mithatList.size() ; j++) {
             result += " "+mithatList.get(j);
        }
        System.out.println(result);

    }




}
