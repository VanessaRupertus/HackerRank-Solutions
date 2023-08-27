/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. Then, print the number
of tokens, followed by each token on a new line.

On the first line, print an integer, n, denoting the number of tokens in string s (they do not need
to be unique). Next, print each of the b tokens on a new line in the same order as they appear in
input string s.
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] arr = s.trim().split("[, ?!.@_']+");

        if (arr.length == 1 && arr[0].equals("")) {
            System.out.println(0);
        }
        else {
            System.out.println(arr.length);
            for (String w : arr) {
                System.out.println(w);
            }
        }
    }
}
