/*
You will be given two integers x and y as input, you have to compute x/y.
If x and y are not 32 bit signed integers or if y is zero, exception will
occur and you have to report it. Read sample Input/Output to know what to
report in case of exceptions.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int q = x / y;
            System.out.println(q);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException a) {
            System.out.println(a);
        }
        sc.close();
    }
}
