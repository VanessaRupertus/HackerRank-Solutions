/*
Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number
is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number
is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a
number is a palindrome or false if it is not.
 */
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isPrime() {
        return a -> {
        if (a < 2) {
            return false;
        }
        else {
            for (int i = 2; i < (int) Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
        };
    }

    public PerformOperation isOdd() {
        return a -> {
            if (a % 2 == 0) {
                return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return a -> {
            String p = Integer.toString(a);
            String r = new StringBuilder(p).reverse().toString();
            return p.equals(r);
        };
    }
}