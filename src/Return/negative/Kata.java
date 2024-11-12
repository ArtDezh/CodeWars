package Return.negative;

public class Kata {
    public static void main(String[] args) {
        System.out.println(makeNegative(-6));
    }

    public static int makeNegative(final int x) {

        return (x < 0) ? x : (x * (-1));

    }
}
