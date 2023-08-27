/*
You are given n lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        int q = sc.nextInt();
        for (int v = 0; v < q; v++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            if (x < list.size() && y < list.get(x).size()) {
                System.out.println(list.get(x).get(y));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}
