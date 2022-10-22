package Arrays;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int i = 0;
        int [][]matris={
                {2,3,4},
                {5,6,4},
        };

        for (int j=0; j< matris[0].length;j++){
            for ( i=0; i< matris.length; i++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
