// Round off floating point numbers to two decimal places


import java.util.Scanner;

public class Round_Off {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double number = scanner.nextDouble();

        String formatted = String.format("%.2f", number);
        System.out.println("Rounded using String.format: " + formatted);

        scanner.close();
    }
}

/*
    Output:
    Enter a floating point number: 3.14159
    Rounded using String.format: 3.14
*/