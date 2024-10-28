package rgb.to.hex;

// Из десятиричную системы счисления в шестнадцатиричную сис. счисления
public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(125, 72, 218));
    }

    public static String rgb(int r, int g, int b) {
        StringBuilder result = new StringBuilder();
        int[] arrNumbers = {r, g, b};
        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Math.max(0, Math.min(255, arrNumbers[i]));
            result.append(String.format("%02X", arrNumbers[i]));
        }
        return result.toString();
    }
}