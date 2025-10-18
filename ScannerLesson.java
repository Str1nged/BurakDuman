package scannerClass;


import java.util.Scanner;

public class ScannerLesson {

    public static void main(String[] args) {

        // Scanner sınıfı nasıl kullanılır ?

        // bize kullanıcıdan veri almayı sağlar.

        // java nesne yönelimli bir yazılım dili.
        //oluşturnuş olduğumuz class,method.. gibi yapılardan nesneler elde etmen ve bunları farklı farklı class'larda ve
        // package larda kullanmaya yarar. Kodun daha düzenli ve güvenilir olmasını sağlar.

        Scanner input = new Scanner(System.in); // Scanner class tan nesne oluşturduk. nesnemizin adı : scan

        System.out.println("Lütfen adınızı giriniz : ");
        String name = input.nextLine();
        System.out.println("Lütfen soyadınızı giriniz : ");
        String surname = input.nextLine();
        String fullName = name +" "+ surname ;
        System.out.println("Tam adınız : "+fullName);


    }


}
