/*
Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern,
we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given
pattern is valid.
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
