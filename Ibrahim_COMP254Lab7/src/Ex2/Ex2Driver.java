package Ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> input = new LinkedList<>();

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        while (n-- > 0)
            input.add(sc.nextInt());

        Queue<Integer> sorted = MergeSortQueues.sort(input);

        System.out.print("Sorted: ");
        while (!sorted.isEmpty())
            System.out.print(sorted.remove() + " ");

        System.out.println();
        sc.close();
    }
}
