//WAP to find transpose of a matrix
import java.util.Scanner;
public class Transpose_Matrix {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}


// Output:
// Enter the no. of rows: 2
// Enter the no. of columns: 3
// Enter the elements of the matrix:
// 1 2 3
// 4 5 6
// The matrix is:
// 1 2 3
// 4 5 6
// The transpose of the matrix is:
// 1 4
// 2 5
// 3 6