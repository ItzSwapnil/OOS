//Factorial of a number in Java

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
    }
}


/*
    Output:
    Enter a number: 5
    Factorial of 5 is: 120
*/