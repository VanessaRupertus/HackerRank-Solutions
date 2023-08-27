/*
Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= n <= 10)
should be printed on a new line in the form: N x i = result.
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; 1 <= i && i <= 10; i++) {
            int r = N * i;
            System.out.println(N + " x " + i + " = " + r);
        }
    }
}
