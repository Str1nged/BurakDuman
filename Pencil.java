package OOP;

public class Pencil {
    //Pencil adında bir class oluşturun, color, lenght, haveEraser adında fields tanımlayın,
    //constructors (4 adet) , write ve delete metodları oluşturarak main metodunda bu class dan
    //bir obje oluşturun.(this() metodu kullanılacak)

    String color;
    int length;

    boolean haveEraser;

    String sentences;

    public Pencil(){

    }

    public Pencil(int lengthInput){

        this.length=lengthInput;

    }

    public Pencil(String colorInput){
        this.color=colorInput;

    }

    public Pencil (String renk,boolean silgiVarYok,int uzunluk){
        this.color=renk;
        this.haveEraser=silgiVarYok;
        this.length=uzunluk;

    }

    public void Write(String yazı){
        this.sentences=yazı;
        System.out.println("Write methodu çalıştı.");
        System.out.println(this.sentences+" cümlesi yazıldı.");
    }


    public void Delete(){
        if(this.haveEraser==true){
            this.sentences="";
            System.out.println("Delete methodu çalıştı.");
            System.out.println("Hafıza silindi.");
            System.out.println("Sentences değişkeninde bulunan ifade : "+this.sentences);
        }
        else{
            System.out.println("Bu kalemde silgi yoktur.Bundan dolayı silme işlemi gerçekleşmedi.");
        }

    }


}
