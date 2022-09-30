package Examples;

public class karakterUzunlukHesap {
    public static void main(String[] args) {
        int uzunluk;

        String ileti="Bilgisayar Mühendisliği";
        uzunluk=ileti.length();

        System.out.println(ileti + ":" +uzunluk);

        ileti=ileti+ " Yüksek lisans programı";

        uzunluk=ileti.length();

        System.out.println(ileti + ":" +uzunluk);
    }
}
