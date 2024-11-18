// 	Input a string without using the substring method

public class Insert_String_Without_Using_Substring_Method {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String toInsert = "Beautiful";
        int insertPosition = 5;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < insertPosition; i++) {
            result.append(original.charAt(i));
        }

        result.append(toInsert);

        for (int i = insertPosition; i < original.length(); i++) {
            result.append(original.charAt(i));
        }

        System.out.println("Original String: " + original);
        System.out.println("String to Insert: " + toInsert);
        System.out.println("Resulting String: " + result.toString());
    }
}

/*
    Output:
    Original String: HelloWorld
    String to Insert: Beautiful
    Resulting String: HelloBeautifulWorld
*/