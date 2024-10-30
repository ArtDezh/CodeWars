package square.every.digit;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(232));
    }

    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();

        String[] arrStr = String.valueOf(n).split("");
        for (String s : arrStr) {
            int temp = (int) Math.pow(Integer.parseInt(s), 2);
            sb.append(temp);
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}
