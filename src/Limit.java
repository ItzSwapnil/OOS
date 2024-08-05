//find prime number using limit using user input
import java.util.Scanner;
public class Limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        for (int i = 2; i <= limit; i++) {
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
