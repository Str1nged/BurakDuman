package tryCatch;

public class TryLesson {
    public static void main(String[] args) {

        // faktoriyel sonucu bulma programı.

        int sonuc=0;

        try{
            sonuc = 0/0;// tanımsız
            System.out.println(sonuc);
            System.out.println("try blok içerisine girildi.");
        }
        catch(Exception e){

            System.out.println("Catch blok girildi.");
            System.out.println(e);

        }

        System.out.println(4+132);
        System.out.println("Kod devam ediliyor.");

    }
}
