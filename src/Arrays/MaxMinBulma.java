package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinBulma {
    public static void main(String[] args) {
        int [] list={55,48,69,-65,-125,87,159};
        int min=list[0];
        int max=list[0];
        Scanner inp= new Scanner(System.in);
        System.out.print("Bir sayı girininiz: ");
        double number= inp.nextDouble();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i: list){
            if (i < number){
                min=i;
            }
            if (i > number){
                max=i;
                break;
            }
        }
        System.out.println("Girilen değere en yakın küçük sayı: " +min);
        System.out.println("Girilen değere en yakın büyük sayı: " +max);

        /*

        for (int i: list){
            if (i< min){
                min= i;
            }
            if (i>max){
                max= i;
            }
        }
        System.out.println("Maximum değer: " +max);
        System.out.println("Minimum değer: " +min);*/
    }
}
