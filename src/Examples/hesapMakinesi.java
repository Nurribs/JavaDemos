package Examples;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner sayi=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        n1= sayi.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        n2=sayi.nextInt();

        System.out.println("-->Yapmak istediğiniz işlemi seçiniz");
        System.out.print("1-Toplama işlemi\n2-Çıkarma işlemi\n3-Çarpma işlemi\n4-bölme işlemi ");
        select= sayi.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam= " +(n1+n2));
                break;
            case 2:
                if (n1>=n2){
                    System.out.println("Fark= " +(n1-n2));
                }
                else{
                    System.out.println("Fark= " +(n2-n1));
                }
                break;
            case 3:
                System.out.println("Çarpma= " +(n1*n2));
                break;
            case 4:
                System.out.println("Bölme= " +(n1/n2));
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız.");
        }

    }
}
