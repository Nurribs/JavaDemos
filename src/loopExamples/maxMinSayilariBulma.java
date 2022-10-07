package loopExamples;
import java.util.Scanner;
public class maxMinSayilariBulma {
    public static void main(String[] args) {
        int n,sayi;
        int max=0,min=0;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kaç tane sayı girilecektir: ");
        n= inp.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i+ ". sayıyı giriniz:");
            sayi= inp.nextInt();
            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min){
                min=sayi;
            }
        }
        System.out.println("Girdiğiniz sayılardan en büyüğü: " +max);
        System.out.println("Girdiğiniz sayılardan en küçüğü: " +min);
    }
}
