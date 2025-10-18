package tekrar;

public class Square {

    int sideLenght;



    public Square(int uzunluk){
        this.sideLenght= uzunluk ;

    }

public int calculateArea(){
        int result = this.sideLenght * this.sideLenght;



        return result;
}
    public  int calculatePerimeter(){
        int result2 = this.sideLenght*4;




        return result2;
    }



}
