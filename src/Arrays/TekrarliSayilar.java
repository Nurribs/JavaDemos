package Arrays;

import java.util.Arrays;

public class TekrarliSayilar {

    static boolean isFind(int []arr, int value){
        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list= {3,5,8,4,3,3,5,4,8,7,5,7};
        int [] duplicate= new int [list.length];
        int startIndex = 0;
        for (int i=0;i<list.length; i++){
                for (int j=0; j<list.length; j++){
                    if (i !=j && (list[i] == list[j])){
                        if (!isFind(duplicate, list[i])){
                            duplicate[startIndex++]= list[i];
                        }
                        break;
                    }
                }
        }
        for (int value: duplicate){
            if(value !=0){
                System.out.println(value);
            }
        }
    }
}
