package loopExamples;
import java.util.Scanner;
public class ebobEkokBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int ebob=1,k=1;

        System.out.print("Birinci sayıyı giriniz: ");
        int n1= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2= inp.nextInt();

        while (k<=n1){
            k++;
            if (n1%k==0 && n2%k==0){
                ebob=k;
                break;
            }
            else{
                System.out.println("Girilen sayıların ebobu mevcut değildir.");
            }
        }
        System.out.println("EBOB= " +ebob);
        System.out.println("EKOK= " +((n1*n2)/ebob));
    }
}
