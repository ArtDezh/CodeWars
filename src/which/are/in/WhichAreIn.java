package which.are.in;

import java.util.*;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};

        System.out.println(Arrays.toString(inArray(a, b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> res = new TreeSet<>();
        for (String s : array1) {
            if (duplicate(array2, s)) {
                res.add(s);
            }
        }
        return res.toArray(new String[0]);
    }

    public static boolean duplicate(String[] container, String element) {
        for (String s : container) {
            if (s.contains(element)) {
                return true;
            }
        }
        return false;
    }
}
