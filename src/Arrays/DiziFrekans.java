package Arrays;
import java.util.Scanner;
public class DiziFrekans {
    public static void main(String[] args) {
        int []array={10,20,20,10,10,20,5,20};
        int sayac=0;

        for (int i=0; i<array.length; i++){
            for (int j=0; j< array.length; j++){
                if (array[i]==array[j]){
                    sayac +=1;
                }
            }
            System.out.println(array[i] +" sayısı " +sayac +" kez tekrar edildi.");
        }


    }
}
