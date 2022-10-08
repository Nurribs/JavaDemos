package Methods;

public class fibonacciSerisi {

    static int fib(int n){

        if (n==1 || n==2){
            return 1;
        }

        int result= fib(n-1) + fib(n-2);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(fib(9));
        //f(n)=f(n-1) + f(n-2)
        //1 1 2 3 5 8 13 21 34
    }
}
