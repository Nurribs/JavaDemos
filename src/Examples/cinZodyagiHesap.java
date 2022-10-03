package Examples;

import java.util.Scanner;

public class cinZodyagiHesap {
    public static void main(String[] args) {
        float dogumYili;
        Scanner date=new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili= date.nextFloat();

        if ((dogumYili%12)==0){
            System.out.println("Çin zodyağı burcunuz: Maymun");
        }
        else if ((dogumYili%12)==1){
            System.out.println("Çin zodyağı burcunuz: Horoz");
        }
        else if ((dogumYili%12)==2){
            System.out.println("Çin zodyağı burcunuz: Köpek");
        }
        else if ((dogumYili%12)==3){
            System.out.println("Çin zodyağı burcunuz: Domuz");
        }
        else if ((dogumYili%12)==4){
            System.out.println("Çin zodyağı burcunuz: Fare");
        }
        else if ((dogumYili%12)==5){
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }
        else if ((dogumYili%12)==6){
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        }
        else if ((dogumYili%12)==7){
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        }
        else if ((dogumYili%12)==8){
            System.out.println("Çin zodyağı burcunuz: Ejderha ");
        }
        else if ((dogumYili%12)==9){
            System.out.println("Çin zodyağı burcunuz: Yılan");
        }
        else if ((dogumYili%12)==10){
            System.out.println("Çin zodyağı burcunuz: At");
        }
        else if ((dogumYili%12)==11){
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}

