//Felipe Oliveira Carvalho 14613879
//Vitor Antonio de Almeida Lacerda 12544761

/*
Modifications:
1. Add the function public static int sumIterative(int n)
2. We added the IF statement, with this message System.out.println("It needs to be a positive number!");
3. We added System.out.println("Sum of all values till " + n + " (Iterative): " + sumIterative(n));
*/


import java.util.Scanner;

public class FactorialCalculator {

    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Added iterative method to calculate sum
    public static int sumIterative(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
          
        System.out.println("Please, enter an integer number:");
        int n = number.nextInt();
        
        if (n > 0) {
            System.out.println("Factorial of " + n + " (Recursive): " + factorialRecursive(n));
            System.out.println("Factorial of " + n + " (Iterative): " + factorialIterative(n));
            // Added the following line to calculate and print sum
            System.out.println("Sum of all values till " + n + " (Iterative): " + sumIterative(n));
        }
        
        else {
            // Added this condition to handle non-positive input
            System.out.println("It needs to be a positive number!");
        }

        number.close(); // Fechando o Scanner
    }
}