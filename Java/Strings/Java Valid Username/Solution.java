/*
You are updating the username policy on your company's internal networking platform.
According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or
greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters
describe the character set consisting of lowercase characters [a -z], uppercase characters [A - Z],
and digits [0 - 9].
The first character of the username must be an alphabetic character, i.e., either lowercase character
 [a -z] or uppercase character [A - Z].
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}$";
        Pattern p = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            Matcher m = p.matcher(username);
            if (m.find()) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
