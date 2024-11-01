package highest.and.lowest;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("5 7 13 -3 21 -5 4"));
    }

    public static String highAndLow(String numbers) {
        var result = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();

        return result.getMax() + " " + result.getMin();
    }
}
