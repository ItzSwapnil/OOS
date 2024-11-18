// Insert a string using a substring method

public class Insert_String_Using_Substring_Method {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String toInsert = "Beautiful";
        int insertPosition = 5;

        String result = original.substring(0, insertPosition) + toInsert + original.substring(insertPosition);

        System.out.println("Original String: " + original);
        System.out.println("String to Insert: " + toInsert);
        System.out.println("Resulting String: " + result);
    }
}

/*
    Output:
    Original String: HelloWorld
    String to Insert: Beautiful
    Resulting String: HelloBeautifulWorld
*/