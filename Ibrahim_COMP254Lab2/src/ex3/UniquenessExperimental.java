package ex3;

import java.util.concurrent.ThreadLocalRandom;

public class UniquenessExperimental {

    public static void main(String[] args) {
        final long LIMIT_MS = 60_000;  // 1 minute limit
        final int MAX_N = 80_000_000;  // safety cap

        // test unique1
        System.out.println("Testing unique1...");
        int n1 = 1000;       // start size
        int last1 = 0;       // last good size
        while (n1 <= MAX_N) {
            long t = timeUnique1(n1);
            System.out.println("n = " + n1 + " time = " + t + " ms");
            if (t > LIMIT_MS) break;
            last1 = n1;
            n1 *= 2;        // double input size
        }
        System.out.println("unique1 max n <= 60s: " + last1);

        // test unique2
        System.out.println("\nTesting unique2...");
        int n2 = 10_000;     // start bigger
        int last2 = 0;
        while (n2 <= MAX_N) {
            long t = timeUnique2(n2);
            System.out.println("n = " + n2 + " time = " + t + " ms");
            if (t > LIMIT_MS) break;
            last2 = n2;
            n2 *= 2;
        }
        System.out.println("unique2 max n <= 60s: " + last2);
    }

    // time unique1
    private static long timeUnique1(int n) {
        int[] arr = randomArray(n);
        long s = System.currentTimeMillis();
        Uniqueness.unique1(arr);
        return System.currentTimeMillis() - s;
    }

    // time unique2
    private static long timeUnique2(int n) {
        int[] arr = randomArray(n);
        long s = System.currentTimeMillis();
        Uniqueness.unique2(arr);
        return System.currentTimeMillis() - s;
    }

    // make random int array
    private static int[] randomArray(int n) {
        int[] a = new int[n];
        ThreadLocalRandom rng = ThreadLocalRandom.current();
        for (int i = 0; i < n; i++) a[i] = rng.nextInt();
        return a;
    }
}
