package ex2;

public class PrefixAverageDriver {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5}; // simple test array

        double[] r1 = PrefixAverage.prefixAverage1(arr);
        double[] r2 = PrefixAverage.prefixAverage2(arr);

        // print results from both methods
        System.out.print("prefixAverage1: ");
        for (double v : r1) System.out.print(v + " ");
        System.out.println();

        System.out.print("prefixAverage2: ");
        for (double v : r2) System.out.print(v + " ");
        System.out.println();
    }
}
