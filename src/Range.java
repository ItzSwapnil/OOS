// find prime numbers in a range
import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower no.: ");
        int low = sc.nextInt();
        System.out.println("Enter the upper no.: ");
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            }
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Output:
// Enter the lower no: 10
// Enter the upper no: 20
// 11
// 13
// 17
// 19
// 20
