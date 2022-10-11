package Methods;
import java.util.Scanner;
public class sayiDesenOlustur {

    static void desenOlustur(int n){
        System.out.print(n + " ");
        if (n>0){
            desenOlustur(n-5);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= inp.nextInt();
        desenOlustur(n);

    }
}
