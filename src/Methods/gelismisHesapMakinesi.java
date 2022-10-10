package Methods;
import java.util.Scanner;
public class gelismisHesapMakinesi {

    Scanner input=new Scanner(System.in);
    static int sum(int a,int b){
        int result= a + b;
        System.out.println("Toplam= " +result);
        return result;
    }
    static int minus(int a,int b){
        int result;
        if (a>b){
            result=a-b;
            System.out.println("Fark= " +result);
        }
        else {
            result=b-a;
            System.out.println("Fark= " +result);
        }
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpım= " +result);
        return result;
    }
    static int divided(int a,int b){
        if (b==0){
            return 0;
        }
        int result=a/b;
        System.out.println("Bölüm= " +result);
        return result;
    }

    static int power(int a,int b){
        int result=1;
        if (a==1 || b==0){
            return 1;
        }
        for (int i=1; i<=b; i++){
            result *=a;
        }
        return result;
    }

    static int factorial(int a){
        if (a==0){
            return 0;
        }
        int result=1;
        for (int i=1; i<=a; i++){
            result *=i;
        }
        System.out.println(a + "!= " +result);
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }
    static void rectangle(int a, int b){

        System.out.println("Çevre: " +((b+a)*2));
        System.out.println("Alan: " +(b*a));
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
        String menu= "1-Toplama işlemi\n"
                +"2-Çıkarma işlemi\n"
                +"3-Çarpma işlemi\n"
                +"4-Bölme işlemi\n"
                +"5-Üslü sayı hesaplama\n"
                +"6-Faktoriyel hesaplama\n"
                +"7-Mod alma\n"
                +"8-Dikdörtgen alan ve çevre hesabı\n"
                +"0-Çıkış Yap\n";

        System.out.println(menu);

        while(true){
            System.out.print("Bir işlem seçiniz: ");
            select= scan.nextInt();

            if (select==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz: ");
            int a= scan.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b= scan.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                   if (divided(a,b)==0){
                       System.out.println("İkinci sayı sıfırdan büyük olmalıdır.");
                   }
                    break;
                case 5:
                    System.out.println("Üs Hesabı: " +power(a,b));
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    System.out.println("Mod alma işlemi: " +mod(a,b));
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, lütfen tekrar deneyiniz..");
            }
        }
    }
}
