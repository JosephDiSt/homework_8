import java.util.Scanner;

public class Fibonacci {

    // Method to compute Fibonacci using recursion
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Method to compute Fibonacci using iteration
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev1 = 0, prev2 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Fibonacci position (n): ");
        int n = scanner.nextInt();

        System.out.print("Choose method (1 for Recursive, 2 for Iterative): ");
        int choice = scanner.nextInt();

        int result = 0;

        if (choice == 1) {
            result = fibonacciRecursive(n);
            System.out.println("Using Recursive method:");
        } else if (choice == 2) {
            result = fibonacciIterative(n);
            System.out.println("Using Iterative method:");
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
            return;
        }

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
