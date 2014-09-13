package academy.thehackerati.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //input to print Fibonacci series for this index
        System.out.print("Enter number to calculate Fibonacci series: ");
        int N = new Scanner(System.in).nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + ": " + Fibonacci.fib(i));
        }
    }
}
