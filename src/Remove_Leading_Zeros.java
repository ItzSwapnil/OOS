// 	Remove leading zeros from a given number in Java


import java.util.Scanner;

public class Remove_Leading_Zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with leading zeros: ");
        String numberWithLeadingZeros = scanner.nextLine();

        String numberWithoutLeadingZeros = numberWithLeadingZeros.replaceFirst("^0+(?!$)", "");

        System.out.println("Number without leading zeros: " + numberWithoutLeadingZeros);

        scanner.close();
    }
}

/*
    Output:
    Enter a number with leading zeros: 00012345
    Number without leading zeros: 12345
*/