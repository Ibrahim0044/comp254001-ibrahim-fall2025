package ex1;

import java.util.Random;

public class ex1driver {

    public static void main(String[] args) {

        Random rand = new Random();

        // tests with load factor 0.5
        ChainHashMap<Integer, Integer> map1 =
                new ChainHashMap<>(17, 0.5);

        // test with load factor 0.8
        ChainHashMap<Integer, Integer> map2 =
                new ChainHashMap<>(17, 0.8);

        int N = 5000;

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            map1.put(rand.nextInt(), i);
        }
        long time1 = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            map2.put(rand.nextInt(), i);
        }
        long time2 = System.nanoTime() - start;

        System.out.println("Time with load factor 0.5 = " + time1);
        System.out.println("Time with load factor 0.8 = " + time2);
    }
}
