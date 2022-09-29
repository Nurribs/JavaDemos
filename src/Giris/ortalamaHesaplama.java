package Giris;

import java.util.Scanner;

public class ortalamaHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih;
        Scanner inp=new Scanner(System.in);

        System.out.print("Mat notunu girin: ");
        mat= inp.nextInt();

        System.out.print("fizik notunu girin: ");
        fizik= inp.nextInt();

        System.out.print("kimya notunu girin: ");
        kimya= inp.nextInt();

        System.out.print("türkçe notunu girin: ");
        turkce= inp.nextInt();

        System.out.print("tarih notunu girin: ");
        tarih= inp.nextInt();

        int toplam=(mat + fizik + kimya + turkce + tarih);
        double sonuc=toplam/5.0;

        System.out.println("ortalama= " +sonuc);

        String durum= (sonuc>=60) ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(durum);


    }
}
