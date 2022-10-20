package Arrays;

public class HarmonikSeri {

    static int [] arrays(int [] arr){
        int sum=0;
        double ortalama=0;

        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = i;
                sum +=j;
                System.out.print(j + " ");
            }
            break;
        }System.out.println("]");

        ortalama=sum/ arr.length;
        System.out.println("Ortalama: " +ortalama);

        return arr;
    }
        /* for (int i=0; i< arr.length; i++){
            int j=0;
            j++;
                arr[j]=i;
                System.out.print(j + " ");
        }*/
}
