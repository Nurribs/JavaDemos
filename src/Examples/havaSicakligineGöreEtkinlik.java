package Examples;

import java.util.Scanner;

public class havaSicakligineGöreEtkinlik {
    public static void main(String[] args) {
        double havaSicakligi;

        Scanner keyboard= new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        havaSicakligi= keyboard.nextDouble();

        System.out.println("Hava sıcaklığı: " +havaSicakligi+ " derecedir.");


        if (havaSicakligi<5){
            System.out.println("Kayak yapabilirsiiniz.");
        }
        else if (havaSicakligi>=5 && havaSicakligi<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (havaSicakligi>=15 && havaSicakligi<25) {
            System.out.println("Piknik yapabilirsiniz.");
        }
        else if (havaSicakligi>=25){
            System.out.println("Yüzmeye gidebilirsiniz..");
        }
        else {
            System.out.println("Geçersiz değer girdiniz..");
        }
    }
}
