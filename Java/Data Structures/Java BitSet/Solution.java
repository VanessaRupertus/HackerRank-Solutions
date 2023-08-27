/*
Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0,
perform a series of M operations. After each operation, print the number of set bits in
the respective BitSets as two space-separated integers on a new line.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        BitSet bitA = new BitSet(n);
        BitSet bitB = new BitSet(n);

        while (m --> 0) {
            String op = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (op) {
                case "AND":
                    if (a == 1) {
                        bitA.and(bitB);
                    }
                    else {
                        bitB.and(bitA);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        bitA.or(bitB);
                    }
                    else {
                        bitB.or(bitA);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        bitA.xor(bitB);
                    }
                    else {
                        bitB.xor(bitA);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        bitA.flip(b);
                    }
                    else {
                        bitB.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        bitA.set(b);
                    }
                    else {
                        bitB.set(b);
                    }
                    break;
            }
            System.out.println(bitA.cardinality() + " " + bitB.cardinality());
        }
        sc.close();

    }
}