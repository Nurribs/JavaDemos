package Methods;

public class palindromSayiBulma {
    static boolean isPalindrom(int number){

        int temp=number,reverseNumber=0,lastNumber;

        while(temp != 0){
           // System.out.println("---------");
           // System.out.println("Sayı: " +temp);
            lastNumber= temp % 10;
           // System.out.println("Sayının son basamağı: " +lastNumber);
            reverseNumber=(reverseNumber * 10) + lastNumber;
           // System.out.println("Yeni sayı: " +reverseNumber);
            temp /= 10;
           // System.out.println("Yeni temp: " +temp);
        }
        if (number==reverseNumber){
            System.out.println(number + " = " +reverseNumber);
            System.out.println("Girdiğiniz sayı bir palindrom sayıdır.");
            return true;
        }
        else {
            System.out.println(number + " != " +reverseNumber);
            System.out.println("Girdiğiniz saı bir palindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(568));




    }
}
