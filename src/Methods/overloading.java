package Methods;

public class overloading {

    static void print(){
        System.out.println("parametreler metodu");
    }
    static void print(int a){
        System.out.println("Parametreler: " +a);
    }
    static void print(double a){
        System.out.println("Double parametre: " +a);
    }
   static int print(int a,int b){
        return a+b;
   }
   static int print(int a,int b,int c){
        int result=a+b+c;
        return result;
   }

    public static void main(String[] args) {

        print();
        print(12);
        print(12.0);
        System.out.println("Result: " +print(5,4));
        System.out.println("Result: " +print(8,2,3));
    }
}
