package Examples;

import java.util.Scanner;

public class taksimetreHesap {
    public static void main(String[] args) {
        int km;
        double perKm= 2.20,total,startPrice=10;

        Scanner inp= new Scanner(System.in);

        System.out.print("Bir km değeri girin: ");
        km=inp.nextInt();

        total= (km*perKm);
        total += startPrice;

        total=(total<20) ? 20 : total;
        System.out.println("Ödenecek tutar: " +total);
    }
}
