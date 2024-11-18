//Write a string "Hello I am Java" and remove vowels using concepts

public class Remove_Vowels {
    public static void main(String[] args) {
        String input = "Hello I am Java";
        String result = removeVowels(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing vowels: " + result);
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}


/*
    Output:
    Original string: Hello I am Java
    String after removing vowels: Hll m Jv
 */