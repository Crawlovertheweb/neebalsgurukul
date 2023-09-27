package ListQueueAssignment;

import java.util.*;

public class Ques4 {
    public static int[] mostfrequent(int[] nums, int k) {
        Map<Integer, Integer> c = new HashMap<>();

        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> p = new PriorityQueue<>(
                (n1, n2) -> c.get(n1) - c.get(n2));

        for (int num : c.keySet()) {
            p.add(num);

            if (p.size() > k) {
                p.poll();
            }
        }

        int[] r = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            r[i] = p.poll();
        }

        return r;
    }

    public static void main(String[] args) {
        int[] n = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topKFrequent = mostfrequent(n, k);

        System.out.println("Top " + k + " most frequent elements:");
        for (int num : topKFrequent) {
            System.out.print(num + " ");
        }
    }
}

