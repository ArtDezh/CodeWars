package bit.counting;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {
        String binaryRepresentation = Integer.toBinaryString(n);
        
        return (int) binaryRepresentation.chars().filter(c -> c == '1').count();
    }
}
