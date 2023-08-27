/*
Write the following code in the unlocked portion of your editor:

Create an array, a, capable of holding  integers.
Modify the code in the loop so that it saves each sequential value to
its corresponding location in the array. For example, the first value
must be stored in a0, the second value must be stored in a1, and so on.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for(int j = 0; j < n; j++) {
            a[j] = scan.nextInt();
        }

        scan.close();

        for (int j : a) {
            System.out.println(j);
        }
    }
}