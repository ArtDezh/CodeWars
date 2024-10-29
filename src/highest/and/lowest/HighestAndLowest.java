package highest.and.lowest;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("5 7 13 -3 21 -5 4"));
    }

    public static String highAndLow(String numbers) {
        String[] arrStrNumbers = numbers.split(" ");
        int[] arrNumbers = new int[arrStrNumbers.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrStrNumbers.length; i++) {
            arrNumbers[i] = Integer.parseInt(arrStrNumbers[i]);
            min = Math.min(min, arrNumbers[i]);
            max = Math.max(max, arrNumbers[i]);
        }

        return max + " " + min;
    }
}
