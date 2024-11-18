// Write a string "Hello World" and reverse it using recursion

public class Reverse_Using_Recursion {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

/*
    Output:
    Original string: Hello World
    Reversed string: dlroW olleH
 */