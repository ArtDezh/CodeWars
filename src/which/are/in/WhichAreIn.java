package which.are.in;

import java.util.Arrays;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};

        System.out.println(Arrays.toString(inArray(a, b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        StringBuilder sb = new StringBuilder();
        String[] resultArr;

        for (String str1 : array1) {
            boolean isSubstr = false;
            for (String str2 : array2) {
                if (str2.contains(str1)) {
                    isSubstr = true;
                    break;
                }
            }
            sb.append(str1).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        resultArr = sb.toString().split(",");
        return resultArr;
    }
}
