package Examples;

import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        int dersSayisi = 0, toplamPuan = 0;
        double ortalama = 0;

        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = not.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = not.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = not.nextInt();
        System.out.print("Turkce notunu giriniz: ");
        turkce = not.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik = not.nextInt();

        if (mat >= 0 && mat <= 100) {
            dersSayisi++;
            toplamPuan += mat;
        }
         if (fizik >= 0 && fizik <= 100) {
            dersSayisi++;
            toplamPuan += fizik;
        }
         if (kimya >= 0 && kimya <= 100) {
            dersSayisi++;
            toplamPuan += kimya;
        }
         if (turkce >= 0 && turkce <= 100) {
            dersSayisi++;
            toplamPuan += turkce;
        }
         if (muzik >= 0 && muzik <= 100) {
            dersSayisi++;
            toplamPuan += muzik;
         }
        if (dersSayisi == 0) {
            System.out.println("Girilen ders bulunamamıştır.");
            }

        else {
            ortalama=(toplamPuan/dersSayisi);
            System.out.println("Ortalama: " + ortalama);
            String durum=(ortalama>=55) ? "Geçtiniz" : "Kaldınız";
            System.out.println(durum);
        }
    }


}
