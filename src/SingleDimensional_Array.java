//find duplicate consecutive elements in an array then remove the duplicate elements and print the array and also show the duplicate numbers

import java.util.Scanner;
public class SingleDimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array after removing duplicate elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Output:
// Enter the size of the array: 4
// Enter the elements of the array:
// 1 2 2 3
// Array after removing duplicate elements:
// 1 2 3