package academy.thehackerati.com;

/**
 * Created by rob on 9/13/14.
 */
public class Fibonacci {
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
