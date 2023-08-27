/*
Given a string, s, and two indices, start and end, print a substring consisting of all
characters in the inclusive range from end-1 to start. You'll find the String class'
substring method helpful in completing this challenge.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start, end));
    }
}