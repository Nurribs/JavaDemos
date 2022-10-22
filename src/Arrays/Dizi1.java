package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Dizi1 {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int n;

        System.out.print("Dizinin boyutu: ");
        n= inp.nextInt();

        int []list=new int[n];

        for (int i=0; i< list.length;i++){
            System.out.print(i +". elemanı giriniz: ");
            list[i]= inp.nextInt();
            System.out.println();
        }

        Arrays.sort(list);
        System.out.println("Sıralama: " +Arrays.toString(list));

    }
}
