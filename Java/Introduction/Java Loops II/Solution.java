/*
You are given q queries in the form of a, b, and n. For each query, print
the series corresponding to the given a, b, and n values as a single line
of n space-separated integers.
 */

import java.util.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }

            System.out.println();
        }
        in.close();
    }
}