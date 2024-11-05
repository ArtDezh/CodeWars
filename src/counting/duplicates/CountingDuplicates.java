package counting.duplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abbdrreThgt"));
    }

    public static int duplicateCount(String text) {
        Map<Character, Integer> mapChars = new HashMap<>();
        int result = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                mapChars.put(c, mapChars.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
            if (entry.getValue() > 1) {
                result++;
            }
        }
        return result;
    }
}
