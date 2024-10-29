package stop.gninnips.my.sdrow;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hello Joe!!! How are you doing today?"));
    }

    public static String spinWords(String sentence) {
        String[] arrWords = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : arrWords) {
            StringBuilder tempSB = new StringBuilder(s);
            if (tempSB.length() >= 5) {
                tempSB.reverse();
                sb.append(tempSB).append(" ");
                continue;
            } else {
                sb.append(s).append(" ");
            }
        }
        return String.valueOf(sb).trim();
    }
}
