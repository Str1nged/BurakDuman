package OOP;

public class Car {
    String model; // Field = özellik
    String renk; // Field = özellik
    int yıl; // Field = özellik

    public Car(){

    }
    public Car(String modelConstructer){
        this.model=modelConstructer;
        // Constructer method
        //return e gerek duymaz
        //class adı ile aynı olmak zorunda
    }


    public Car(String renk,int yılConst){
        this.renk=renk;
        this.yıl=yılConst;
    }






}
