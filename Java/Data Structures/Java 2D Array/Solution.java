/*
You are given a 6 * 6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros,
it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it.
The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[][] a = new String[6][];

        for (int i = 0; i < 6; i++) {
            a[i]=sc.nextLine().split(" ");
        }

        sc.close();
        int bigSum = -100;

        for (int j = 0; j < 4; j++) {
            for (int v = 0; v < 4; v++) {
                int sum = Integer.parseInt(a[j][v])
                        + Integer.parseInt(a[j][v+1])
                        + Integer.parseInt(a[j][v+2])
                        + Integer.parseInt(a[j+1][v+1])
                        + Integer.parseInt(a[j+2][v])
                        + Integer.parseInt(a[j+2][v+1])
                        + Integer.parseInt(a[j+2][v+2]);
                if (sum > bigSum) {
                    bigSum = sum;
                }
            }
        }
        System.out.println(bigSum);
    }
}
