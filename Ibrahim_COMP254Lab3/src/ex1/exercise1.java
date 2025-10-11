package ex1;
import java.util.Scanner;

public class exercise1 {

    // multiply two positive numbers using only + and -
    public static int product(int m, int n) {
        // stop when n is 0
        if (n == 0)
            return 0;
        // add m and call again with n - 1
        return m + product(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (m): ");
        int m = sc.nextInt();
        System.out.print("Enter second number (n): ");
        int n = sc.nextInt();

        int result = product(m, n);

        System.out.println("Result: " + m + " * " + n + " = " + result);

        sc.close();
    }
}
