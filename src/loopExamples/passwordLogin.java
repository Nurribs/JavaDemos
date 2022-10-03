package loopExamples;
import java.util.Scanner;
public class passwordLogin {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess= true;

        Scanner inp= new Scanner(System.in);

        while (isPasswordSuccess){
            System.out.print("Lütfen şifreyi giriniz: ");
            password= inp.nextInt();
            if (password==123){
                System.out.println("Doğru");
                isPasswordSuccess=false;
            }
            else {
                System.out.println("Yanlış");
            }
        }
    }
}
