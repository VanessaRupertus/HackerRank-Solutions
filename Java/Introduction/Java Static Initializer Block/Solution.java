/*
You are given a class Solution with a main method. Complete the given code
so that it outputs the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.

If B <= 0 or h <= 0, the output should be
"java.lang.Exception: Breadth and height must be positive" without quotes
 */
import java.util.*;

public class Solution {
    public static boolean flag = true;
    public static int B;
    public static int H;
    static {
        Scanner sc = new Scanner (System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B<=0 || H<=0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
