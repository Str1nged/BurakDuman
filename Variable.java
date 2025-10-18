package variables;

public class Variable {

    public static void main(String[] args) {
        // m : char
        // isim mithat : String
         // yaş 21 : int
        // bjk li misin ? true/ false : boolean
        // 70,35 : double
        // long byte short : sayılar

        char isminİlkHarfi = 'm'; // char : veri tipi ,  isminİlkHarfi : değişken adı , 'm' : value ,
        // = atama operatörü : eşittirin sağında kalan değer soldaki değişkene atanır.

        String isim = "Mithat";

        int yaş = 21 ;

        double ortalama = 84.45;

        boolean bjkDestek = false;

        char karakter = 56;
       // System.out.println(karakter);

        String soyad;
        soyad =""; //string ifadenin değeri yoksa null
       /* System.out.println(isim);
        System.out.println(yaş);
        System.out.println(ortalama);
        System.out.println(bjkDestek);*/


        // Benim adm enes yaşım 27 ve Galatasaray takımını destekliyorum.

        String name = "Enes";
        int age = 27;
        String takim = "Galatasaray";

        //System.out.println("Benim adım " + name + " yaşım " + age + " ve " + takim + " takımını destekliyorum." );


        //System.out.println(soyad);


            int mithatYas,enesYas,burakYas;
            mithatYas=21;
            enesYas=27;
            burakYas = enesYas-mithatYas + 11;
        System.out.println("Burak'ın yaşı : "+burakYas);

    }

}
