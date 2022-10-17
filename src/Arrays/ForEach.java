package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int [] list= {1,2,3,4};
        
        for (int i=0; i<list.length; i++){
            //System.out.println(list[i]);
        }

        int sum=0;
        for (int i: list) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Toplam= " +sum);

    }
}
