/*
Complete the function power in class MyCalculator and return the appropriate result after
the power operation or an appropriate exception as detailed above.
 */

class MyCalculator {
    public String power(int n, int p) throws Exception {
        int power = 0;
        String excString = "";
        try{
            if (n < 0 || p < 0) {
                excString = "java.lang.Exception: n or p should not be negative.";
                throw new Exception();
            }
            else if (n == 0 && p == 0) {
                excString = "java.lang.Exception: n and p should not be zero.";
                throw new Exception();
            }
            else {
                power = (int) Math.pow(n, p);
                return Integer.toString(power);
            }
        }
        catch (Exception e) {
            return excString;
        }
    }

}