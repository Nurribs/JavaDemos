package Examples;

import java.util.Scanner;

public class vucutKitleIndeks {
    public static void main(String[] args) {
        double boy,mass,index;

        Scanner inp= new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(m): " );
        boy=inp.nextDouble();

        System.out.print("Kilonuzu giriniz(kg): " );
        mass=inp.nextDouble();

        index= mass/(boy*boy);

        System.out.println("Kitle indeksiniz: " +index);

    }
}
