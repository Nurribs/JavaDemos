package Examples;

import java.util.Scanner;

public class ucgenHesaplama {
    public static void main(String[] args) {
        float birinciKenar,ikinciKenar,ucuncuKenar;
        float u,cevre,alan;

        Scanner inp= new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        birinciKenar= inp.nextFloat();

        System.out.print("İkinci kenarı giriniz: ");
        ikinciKenar= inp.nextFloat();

        System.out.print("Üçüncü kenarı giriniz: ");
        ucuncuKenar= inp.nextFloat();

        u=(birinciKenar+ikinciKenar+ucuncuKenar)/2;
        cevre= 2*u;
        alan= u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar);

        System.out.println("Üçgenin alanı: " +alan+ "\nÜçgenin çevresi: " +cevre);

    }
}
