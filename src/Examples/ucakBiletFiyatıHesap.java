package Examples;

import java.util.Scanner;

public class ucakBiletFiyatıHesap {
    public static void main(String[] args) {
        int yas,yolculukTipi;
        double ucret=0,km;

        Scanner input= new Scanner(System.in);

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek-Yön, 2 => Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        if (yolculukTipi==1){
            System.out.println("Yolculuk tipiniz= Tek-yön");
            ucret=km*0.10;
            if (yas<12 && yas>=0){
                ucret *=0.5;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
            else if(yas>=12 && yas<24){
                ucret *=0.90;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
            else if (yas>=65){
                ucret *=0.70;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
        }
        else if (yolculukTipi==2){
            System.out.println("Yolculuk tipiniz= Gidiş-dönüş");
            ucret=km*0.10*0.80;
            if (yas<12 && yas>=0){
                ucret *=0.5*0.80;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
            else if(yas>=12 && yas<24){
                ucret *=0.90*0.80;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
            else if (yas>=65){
                ucret *=0.70*0.80;
                System.out.println("Ödeyeceğiniz tutar = " +ucret);
            }
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
