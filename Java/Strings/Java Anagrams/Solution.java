/*
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string

Returns:

boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
 */
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        else {
            String aC = a.toLowerCase();
            String bC = b.toLowerCase();
            char[] aArr = aC.toCharArray();
            Arrays.sort(aArr);
            char[] bArr = bC.toCharArray();
            Arrays.sort(bArr);

            for (int i = 0; i < a.length(); i++) {
                if (aArr[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        s.close();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
