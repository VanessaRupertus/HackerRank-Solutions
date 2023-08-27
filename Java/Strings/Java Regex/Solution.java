/*
Write a class called MyRegex which will contain a string pattern.
You need to write a regular expression and assign it to the pattern
such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255
 */
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String address = sc.next();
            System.out.println(address.matches(new MyRegex().pattern));
        }
        sc.close();
    }
}

class MyRegex {
    public String pattern = "(1\\d\\d|000|(00|)\\d|(0|)\\d\\d|2[0-4]\\d|25[0-5])."
                            + "(1\\d\\d|000|(00|)\\d|(0|)\\d\\d|2[0-4]\\d|25[0-5])."
                            + "(1\\d\\d|000|(00|)\\d|(0|)\\d\\d|2[0-4]\\d|25[0-5])."
                            + "(1\\d\\d|000|(00|)\\d|(0|)\\d\\d|2[0-4]\\d|25[0-5])";
}
