package which.are.in;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};

        System.out.println(Arrays.toString(inArray(a, b)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> res = new TreeSet<>();
        for(int i=0;i<array1.length;i++){
            if(duplicate(array2, array1[i])){
                res.add(array1[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static boolean duplicate(String [] container, String element){
        for (String s : container) {
            if (s.contains(element)) {
                return true;
            }
        }
        return false;
    }
}
