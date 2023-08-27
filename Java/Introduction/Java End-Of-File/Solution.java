/*
Read some unknown n lines of input from stdin(System.in) until you reach EOF;
each line of input contains a non-empty String.
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = 1;
        while (scan.hasNext()) {
            String next = scan.nextLine();
            System.out.println(line + " " + next);
            line++;
        }
    }
}