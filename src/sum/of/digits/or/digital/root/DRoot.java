package sum.of.digits.or.digital.root;

public class DRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(12345));
    }

    public static int digital_root(int n) {
        while (n >= 10) {
            n = digital_sum(n);
        }
        return n;
    }

    public static int digital_sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
