/*
Given an array, s, of n real number strings, sort them in descending order — but wait,
 there's more! Each number must be printed in the exact same format as it was read
 from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers
 represent numerically equivalent values (e.g., ), then they must be listed in the
 same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange
array s's elements according to the instructions above.
 */
import java.math.BigDecimal;
import java.util.*;
class Solution {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Comparator<String> decimalCompare = (s1, s2) -> {
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            return b.compareTo(a);
        };

        Arrays.sort(s,0, n, decimalCompare);

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}