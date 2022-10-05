package loopExamples;
import java.util.Scanner;
public class kuvvetHesaplama {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n=inp.nextInt();

        for (int i=1; i<=n; i*=4){
            System.out.println("i= " +i);
        }
        System.out.println("\n");
        for (int j=1; j<=n; j*=5){
            System.out.println("j= "+j);
        }
    }
}
