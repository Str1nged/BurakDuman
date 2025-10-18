package hatırlatma;

import java.util.ArrayList;

public class HatirlatmaDers {


    public static void main(String[] args) {


        // for if kullanarak 0 dan  100 e kadar olan sayılardan 7 ye tam bölünenleri bulan programı yazınız.

        ArrayList<Integer> list = new ArrayList<>();

        int sonuc =0;

        for (int i = 0; i <= 100 ; i++) {
            sonuc = i % 7;
            if(sonuc == 0){
                list.add(i);
            }

        }
        System.out.println(list);
        System.out.println(list.contains(35));


    }






}
