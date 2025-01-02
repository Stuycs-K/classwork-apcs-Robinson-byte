public class fib{
    public static void main(String[] args){
        int n = 50;
        System.out.println("Fibonacci sequence " + n + "terms:" );
        for (int i = 0;i<n;i++){
            System.out.println(i+ " , " + fibonacci(i) );
        }
    }

    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}