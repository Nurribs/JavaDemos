package Arrays;

public class MainArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {

        //şeklinde de tanımlanabilir.
        // int [] list= new int[10];

        // int []list3= new int[]{1,2,3,4};
        // System.out.println(list3[2]);

        int[] list = {10, 20, 30, 40, 50};
        double[] list2 = {1.1, 1.2, 1.3};

        printArray(list);
        printArray(list2);
    }
}
