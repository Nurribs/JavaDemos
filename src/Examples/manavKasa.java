package Examples;

import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double a,e,d,m,p;

        Scanner inp= new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        a=inp.nextDouble();
        System.out.print("Elma kaç kilo: ");
        e=inp.nextDouble();
        System.out.print("Domates kaç kilo: ");
        d=inp.nextDouble();
        System.out.print("Muz kaç kilo: ");
        m=inp.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        p=inp.nextDouble();
        a *=2.14;
        e *=3.67;
        d *=1.11;
        m *=0.95;
        p *=5.00;
        System.out.println("Armut fiyat: " +a);
        System.out.println("Elma fiyat: " +e);
        System.out.println("Domates fiyat: " +d);
        System.out.println("Muz fiyat: " +m);
        System.out.println("Patlıcan fiyat: " +p);

    }
}
