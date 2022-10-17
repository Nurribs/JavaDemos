package Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i=0; i< matris.length; i++){
            for (int k=0; k< matris[i].length; k++){
               // System.out.println(matris[i][k] + " ");
            }
           // System.out.println();
        }

        for (int []row : matris){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
