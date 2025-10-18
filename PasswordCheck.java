package methods;

import java.util.Scanner;

public class PasswordCheck {

    public static boolean checkPassword(){
        Scanner scan = new Scanner(System.in);
        String password = "Enes123";
        boolean sonuc = false;

        System.out.println("Lütfen şifrenizi giriniz :");
        String inputPassword = scan.nextLine();

        if(password.equals(inputPassword)){
            sonuc = true;
        }else{
            sonuc = false;
        }

        return sonuc;
    }


}
