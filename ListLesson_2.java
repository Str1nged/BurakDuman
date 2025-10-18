package List;

import java.util.ArrayList;
import java.util.List;

public class ListLesson_2 {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("mithat"); // 0 1 2 index numarası 0 dan başlar. ilk eleman index numarası her zaman = 0;
        nameList.add("enes");
        nameList.add("elif");
        nameList.add("nisa");
        nameList.add("mehmet");
        nameList.add("fatih");
        nameList.add("burak");
        nameList.add("ÖZDEM");
        nameList.add("özLeM");
        nameList.add("furkan"); // nameList.size()-1




        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);


// namelist.size()-1 = son elemanın index numarası oldupunu biliyorum

     /*   for (int i = nameList.size()-1 ; i >=0; i--) { // 7 => 0
            System.out.println(nameList.get(i));
        }*/

        List<String> lowerList = new ArrayList<>();
        for (int i = 0; i < nameList.size() ; i++) {
            lowerList.add(nameList.get(i).toLowerCase());
        }


        String searchName = "Özlem";
       searchName= searchName.toLowerCase();

        System.out.println(lowerList.contains(searchName));
        System.out.println(lowerList.equals(numberList));




    }

}
