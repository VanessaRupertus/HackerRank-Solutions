/*
In this problem, you have to add and multiply huge numbers!
These numbers are so big that you can't contain them in any
ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.
 */
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aS = sc.nextLine();
        String bS = sc.nextLine();
        BigInteger a = new BigInteger(aS);
        BigInteger b = new BigInteger(bS);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        sc.close();
    }
}
