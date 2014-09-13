package academy.thehackerati.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter number to calculate Fibonacci series, or 'q' for quit: ");
        Scanner sc = new Scanner(System.in);
        String nextL;
        try {
            while (!((nextL = sc.nextLine()).equalsIgnoreCase("q"))) {
                System.out.println(nextL);
                int N = 0;
                try {
                    N = Integer.parseInt(nextL);
                    Fibonacci myFib = Fibonacci.getFib(N);
                    System.out.println("Fib length = " + myFib.getFibLenth());
                    System.out.println("Fib value = " + myFib.getFibValue());
                } catch (IllegalArgumentException e) {
                    System.out.println("\tError: Try again. You did not enter an integer or 'q' for quit.");
                    //e.printStackTrace();
                }
                System.out.print("Enter number to calculate Fibonacci series, or 'q' for quit: ");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
