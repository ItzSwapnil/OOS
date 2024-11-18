//Write a program to find and remove duplicate consecutive elements from an array in Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Consecutive_Elements {
    public static int[] removeConsecutiveDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = removeConsecutiveDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing consecutive duplicates: " + Arrays.toString(result));
        scanner.close();
    }
}

/*
    Output:
Enter the number of elements in the array: 5
Enter the elements of the array:
1 2 3 3 4
Original array: [1, 2, 3, 3, 4]
Array after removing consecutive duplicates: [1, 2, 3, 4]
 */