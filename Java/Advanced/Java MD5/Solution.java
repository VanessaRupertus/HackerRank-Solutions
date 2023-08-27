/*
Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
 */
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(s.getBytes());

            for (byte b : digest) {
                System.out.format("%02x", b);
            }
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm does not exist.");
        }

    }
}