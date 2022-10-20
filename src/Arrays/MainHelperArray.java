package Arrays;
import java.util.Arrays;
public class MainHelperArray {
    public static void main(String[] args) {
        int [] list={1,2,3,4};
        int [] list2={5,68,95,4,25,1};
        double [] list3={1.1,2.5,3.4};

        /*HelperArray helper = new HelperArray();
        helper.print(list);
        helper.print(list2);
        helper.print(list3);*/ //nesne oluşturarak metot çağırma

       /*HelperArray.print(list);
        HelperArray.print(list2);
        HelperArray.print(list3);*/ // nesne oluşturmadan metot çağırma

        /*System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(list3));*/

        /*System.out.println(HelperArray.search(list2,25));
        System.out.println();*/

        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        int index =Arrays.binarySearch(list2,25);
        System.out.println("25 in indeksi : " +index);

    }
}
