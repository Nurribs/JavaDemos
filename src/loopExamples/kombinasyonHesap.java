package loopExamples;
import java.util.Scanner;
public class kombinasyonHesap {
    public static void main(String[] args) {
        int n,r;
        int total1=1,total2=1,total3=1;
        double combination=0;

        Scanner inp= new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu hesaplanacaktır.");
        System.out.print("n sayısını giriniz: ");
        n= inp.nextInt();
        System.out.print("r sayısını giriniz: ");
        r=inp.nextInt();

        for (int i=1; i<=n; i++){
            total1 *=i;
        }
        System.out.println("n!= " +total1);

        for (int i=1; i<=r; i++){
            total2 *=i;
        }
        System.out.println("r!= " +total2);

        for (int i=1; i<=n-r; i++){
            total3 *=i;
        }
        System.out.println("(n-r)!= " +total3);

        combination=total1/(total2*total3);

        System.out.println("C(n,r)= " +combination);
    }
}
