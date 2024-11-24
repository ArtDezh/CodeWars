package persistent.bugger;

public class Persist {
    public static void main(String[] args) {
        System.out.println(rightDigits(999));
    }

    public static long persistence(long n) {
        long temp = 1;
        while (n != 0) {
            temp *= n % 10;
            n /= 10;
        }

        return temp;
    }

    public static int rightDigits(long n) {
        int result = 0;
        while (n >= 10) {
            n = persistence(n);
            result++;
        }
        return result;
    }
}
