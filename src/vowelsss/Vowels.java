package vowelsss;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(getCount("gjfhweiacv"));
    }

    public static int getCount(String str) {
        int countVowels = 0;
        char[] arrChars = str.toCharArray();
        for (char arrChar : arrChars) {
            if (arrChar == 'a' || arrChar == 'e' || arrChar == 'i' || arrChar == 'o'
                    || arrChar == 'u') countVowels++;
        }
        return countVowels;
    }
}
