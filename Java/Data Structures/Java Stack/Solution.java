/*
A string containing only parentheses is balanced if the following is true:
1. if it is an empty string
2. if A and B are correct, AB is correct,
3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format
There will be multiple lines in the input file, each having a single non-empty string.
You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.
 */
import java.util.*;
class Solution{

    public static boolean isBalanced(String str, char open, char close) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char next = str.charAt(i);
            if(next == close) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            if (next == open) {
                stack.push(String.valueOf(next));
            }
        }
        return stack.empty();
    }

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input, '[', ']') &&
                    isBalanced(input, '(', ')') &&
                    isBalanced(input, '{', '}'));
        }
    }
}