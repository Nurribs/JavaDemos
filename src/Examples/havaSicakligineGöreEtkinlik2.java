package Examples;
import java.util.Scanner;
public class havaSicakligineGöreEtkinlik2 {
    public static void main(String[] args) {
        double havaSicakligi;

        Scanner keyboard= new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        havaSicakligi= keyboard.nextDouble();

        System.out.println("Hava sıcaklığı: " +havaSicakligi+ " derecedir.");


        if (havaSicakligi<5){
            System.out.println("Kayak yapabilirsiiniz.");
        }
        else if (havaSicakligi<=25) {
            if (havaSicakligi>=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            if (havaSicakligi<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
