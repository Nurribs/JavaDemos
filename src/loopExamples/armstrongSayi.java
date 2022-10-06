package loopExamples;
import java.util.Scanner;
public class armstrongSayi {
    public static void main(String[] args) {
        int number;
        int basNumber=0;
        int tempNumber= number;
        int basValue;
        int result=0;
        int basPow;

        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number= inp.nextInt();

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while(tempNumber != 0){
            basValue = tempNumber % 10;
            //1*1*1*1 = 1^4
            basPow = 1;
            for (int i=1; i<=basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " sayısı bir armstrong sayıdır.");
        }
        else {
            System.out.println(number + " sayısı bir armstrong sayı değildir.");
        }

    }
}
