package loopExamples;
import java.util.Scanner;
public class harmonikSeriBulma {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a number(n): ");
        int n= inp.nextInt();
        double result=0.0;

        //result=1+1/2+1/3+1/4+....+1/n

        for (int i=1; i<=n; i++){
            result +=(1.0/i);
        }
        System.out.println("Total= " +result);
    }
}
