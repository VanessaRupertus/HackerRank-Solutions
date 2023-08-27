/*
Given a string A, print Yes if it is a palindrome, print No otherwise.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        s.close();

        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();

        if (A.equals(B.toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
