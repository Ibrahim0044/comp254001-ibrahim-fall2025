package ex2;

public class PrefixAverageExperimental {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000}; // representative n values

        // print header
        System.out.printf("%-10s %-20s %-20s%n",
                "Size (n)", "prefixAverage1 (ns)", "prefixAverage2 (ns)");

        for (int n : sizes) {
            double[] data = new double[n];
            for (int i = 0; i < n; i++) data[i] = Math.random();

            // time prefixAverage1
            long s1 = System.nanoTime();
            PrefixAverage.prefixAverage1(data);
            long t1 = System.nanoTime() - s1;

            // time prefixAverage2
            long s2 = System.nanoTime();
            PrefixAverage.prefixAverage2(data);
            long t2 = System.nanoTime() - s2;

            // print results in table format
            System.out.printf("%-10d %-20d %-20d%n", n, t1, t2);
        }
    }
}
