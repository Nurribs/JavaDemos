package Giris;

import java.util.*;

public class Ders1 {
    public static void main(String[] args) {
        int birinciSayi,ikinciSayi;
        Scanner klavye = new Scanner(System.in);

        System.out.print("ilk sayi: ");
        birinciSayi=klavye.nextInt();
        System.out.println("iki sayi giriniz: ");
        ikinciSayi=klavye.nextInt();

        System.out.println("Birinci sayi: " +birinciSayi);
        System.out.println("ikinci sayi: " +ikinciSayi);
    }
}
