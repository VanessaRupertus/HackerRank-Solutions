/*
Given an array of n integers, find and print its number of negative subarrays on a new line.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int nSubs = 0;

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int v = j; v < n; v++) {
                sum = sum + a[v];
                if (sum < 0) {
                    nSubs++;
                }
            }
        }
        System.out.println(nSubs);
    }
}