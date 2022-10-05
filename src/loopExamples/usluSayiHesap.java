package loopExamples;
import java.util.Scanner;
public class usluSayiHesap {
    public static void main(String[] args) {
        int n,k;
        int carpim=1;
        Scanner inp= new Scanner(System.in);

        System.out.print("üs alınacak sayıyı giriniz(n): ");
        n= inp.nextInt();
        System.out.print("Sayının üssünü giriniz(k): ");
        k= inp.nextInt();

        for (int i=1; i<=k; i++){
            carpim *=n;
            }
        System.out.println("n üssü k= " +carpim);
    }
}
