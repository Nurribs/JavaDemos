package MultidimensionalArrays;

public class Main {
    public static void main(String[] args) {

        int[] list = new int[5];        //tek boyutlu dizi

        int[][] matris = new int[6][6]; //çok boyutlu dizi
        matris[0][0] = 0;
        matris[2][3] = 200;

        int number = 1;

        int[][] matris2 = new int[6][6];
                /*{ {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},};*/

        System.out.println(matris2[4][4]);
        System.out.println(matris2.length);      //sütunun boyutu
        System.out.println(matris2[0].length);   //satırın boyutu

        for (int i = 0; i < matris2.length; i++) {
            //matris[0],matris[1],matris[2],matris[3],matris[4],matris[5]
            System.out.println(matris2[i].length);
            for (int j = 0; j < matris2[i].length; j++) {
                matris2[i][j] = number++;
            }
        }
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println();
        }
    }
}