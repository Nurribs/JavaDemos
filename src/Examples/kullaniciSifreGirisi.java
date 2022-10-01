package Examples;

import java.util.Scanner;

public class kullaniciSifreGirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName=inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password=inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        }
        else{
            System.out.println("Bilgiler yanlış,giriş yapılamadı.");
        }
    }
}
