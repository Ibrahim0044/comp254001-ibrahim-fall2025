package Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortQueues {

    private static Queue<Integer> merge(Queue<Integer> a, Queue<Integer> b) {
        Queue<Integer> r = new LinkedList<>();
        while (!a.isEmpty() && !b.isEmpty()) {
            if (a.peek() <= b.peek()) r.add(a.remove());
            else r.add(b.remove());
        }
        while (!a.isEmpty()) r.add(a.remove());
        while (!b.isEmpty()) r.add(b.remove());
        return r;
    }

    public static Queue<Integer> sort(Queue<Integer> data) {
        Queue<Queue<Integer>> qq = new LinkedList<>();

        while (!data.isEmpty()) {
            Queue<Integer> q = new LinkedList<>();
            q.add(data.remove());
            qq.add(q);
        }

        while (qq.size() > 1) {
            Queue<Integer> q1 = qq.remove();
            Queue<Integer> q2 = qq.remove();
            qq.add(merge(q1, q2));
        }

        return qq.remove();
    }
}
