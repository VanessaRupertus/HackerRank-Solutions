/*
In this problem, you are given N integers. You need to find the maximum number
of unique integers among all the possible contiguous subarrays of size M.

Note: Time limit is 3 second for this problem.
 */
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int unique = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                int set_size = set.size();
                if (set_size > unique) {
                    unique = set_size;
                }
                Integer removed = (Integer) deque.pollFirst();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }
        sc.close();

        System.out.println(unique);
    }
}