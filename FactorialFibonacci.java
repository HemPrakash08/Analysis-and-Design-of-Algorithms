public class FactorialFibonacci {

    // Factorial
    static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // Fibonacci 
    static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) { c = a + b; a = b; b = c; }
        return b;
    }

    static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial Iterative(" + n + ") = " + factorialIterative(n));
        System.out.println("Factorial Recursive(" + n + ") = " + factorialRecursive(n));
        System.out.println("Fibonacci  Iterative(" + n + ") = " + fibonacciIterative(n));
        System.out.println("Fibonacci  Recursive(" + n + ") = " + fibonacciRecursive(n));
    }
}
