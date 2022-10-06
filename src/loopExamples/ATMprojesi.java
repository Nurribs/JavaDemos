package loopExamples;
import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp=new Scanner(System.in);
        int right=3;
        int balance=1500;
        double price=0.0;

        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName= inp.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password= inp.nextLine();
            if (userName.equals("abcd") && password.equals("abc123")){
                System.out.println("Merhaba, X bankasına hoş geldiniz!");
                System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                System.out.print("Gerçekleştirmek istediğiniz işlemi seçiniz: ");
                int select= inp.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Yatırılacak para miktarı: ");
                        price= inp.nextDouble();
                        balance += price;
                        System.out.println("Yeni bakiyeniz: " +balance);
                        break;
                    case 2:
                        System.out.print("Çekilecek para miktarı: ");
                         price=inp.nextDouble();
                        if (price>balance){
                            System.out.println("Yetersiz bakiye..");
                        }
                        else {
                            System.out.println("Çekilen para miktarı: " +price+ "\nKalan bakiye: " +(balance -=price));
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " +balance);
                        break;
                    case 4:
                        System.out.println("Sistemden çıkış yapılıyor.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem yaptınız, ana menüye dönünüz.");
                        break;
                }
                   break;     //right=0;
            }
            else {
                right--;
                System.out.println("Hatalı giriş yaptınız,tekrar deneyiniz..");
                if (right==0){
                    System.out.println("Giriş hakkınız dolmuş, hesap bloke olmuştur.");
                }
                else {
                    System.out.println("Kalan giriş hakkınız: " +right);
                }
            }
        }
    }
}
