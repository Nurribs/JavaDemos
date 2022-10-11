package Methods;
import java.util.Scanner;
public class asalSayiHesap {
    static void asal(int sayi, int i){

        if (i > sayi/2){
            System.out.println(sayi + " asal sayı değildir.");
            return;
        }

        else if (sayi % i == 0) {
            System.out.println(sayi + " asal sayıdır.");
            return;
        }
        asal(sayi, i++);
    }

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi= inp.nextInt();

        asal(sayi,2);

    }
}
