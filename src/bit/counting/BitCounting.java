package bit.counting;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
    }
}
