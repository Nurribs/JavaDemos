package Methods;

public class Examples1 {
    static int sum(int a,int b){
        int result= a+b;
        System.out.println(result);
        return result;
    }
   /* static void sum(int a,int b){
        int result=a+b;
        System.out.println(result);
    }*/

    public static void main(String[] args) {

        int result=sum(5,2) * sum(6,8);
        System.out.println(result);

        // sum(6,4);

    }
}