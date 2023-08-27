/*
You are given a class Solution and its main method in the editor.
Your task is to create a class Prime. The class Prime should
contain a single method checkPrime.

The locked code in the editor will call the checkPrime method
with one or more integer arguments. You should write the checkPrime
method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading!
 */
import java.util.*;

class Prime {

    void checkPrime(int...nums) {
        for (int num : nums) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=Integer.parseInt(sc.nextLine());
        int n2=Integer.parseInt(sc.nextLine());
        int n3=Integer.parseInt(sc.nextLine());
        int n4=Integer.parseInt(sc.nextLine());
        int n5=Integer.parseInt(sc.nextLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);

        sc.close();
    }
}