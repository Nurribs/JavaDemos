package Giris;

public class stringMethods {
    public static void main(String[] args) {
        String ileti1="MERHABA";
        String kucukHarfli=ileti1.toLowerCase();
        System.out.println(kucukHarfli);

        String ileti2="merhaba";
        String buyukHarfli=ileti2.toUpperCase();
        System.out.println(buyukHarfli);

        String ileti3="merhaba";
        String parca=ileti3.substring(4);
        System.out.println(parca);

        String ileti4="merhaba";
        String parca2=ileti4.substring(0,5);
        System.out.println(parca2);

        String ileti5="müdür müdür müdür?";
        int mudurNerede=ileti5.indexOf("müdür");
        System.out.println(mudurNerede);


    }
}
