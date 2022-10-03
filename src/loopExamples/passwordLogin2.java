package loopExamples;
import java.util.Scanner;

public class passwordLogin2 {
    public static void main(String[] args) {
        int pass;
        boolean askPassword=true;

        Scanner inp=new Scanner(System.in);
        do {
            System.out.print("Şifreyi giriniz: ");
            pass= inp.nextInt();
            if (pass==123){
                System.out.println("Doğru");
                askPassword=false;
            }
            else {
                System.out.println("Yanlış");
            }
        } while (askPassword);
    }
}
