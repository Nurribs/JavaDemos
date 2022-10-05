package loopExamples;
import java.util.Scanner;
public class girilenSayilarinToplamıCift {
    public static void main(String[] args) {
        int k,total=0;

        Scanner scan=new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            k=scan.nextInt();
            if (k%4==0){
                total += k;
            }
        }while(k%2==0);
        System.out.println("Total: " +total);
    }
}
