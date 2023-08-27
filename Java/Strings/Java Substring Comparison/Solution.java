/*
Given a string, s, and an integer, k, complete the function so that it finds the
lexicographically smallest and largest substrings of length k.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.length() - i >= k) {
                list.add(s.substring(i, k + i));
            }
        }
        Collections.sort(list);
        System.out.printf("%s", list.get(0));
        System.out.printf("\n%s",list.get(list.size() - 1));
    }
}
