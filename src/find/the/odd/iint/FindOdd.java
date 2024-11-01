package find.the.odd.iint;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindOdd {
    public static void main(String[] args) {
        int[] a = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hp.put(a[i], hp.getOrDefault(a[i], 0) + 1);
        }

        int result = 0;
        Set<Integer> keys = hp.keySet();
        for (Integer i : keys) {
            result = hp.get(i);
            if (result % 2 != 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
