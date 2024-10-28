
// Из десятиричную системы счисления в шестнадцатиричную сис. счисления
public class Main {
    public static void main(String[] args) {
        System.out.println(rgb(132, 77, 219));
    }

    public static String rgb(int r, int g, int b) {
        StringBuilder result = new StringBuilder();
        int[] arrNumbers = {r, g, b};
        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Math.max(0, Math.min(255, arrNumbers[i]));
            result.append(Integer.toHexString(arrNumbers[i]));
        }
        return result.toString().toUpperCase();
    }
}