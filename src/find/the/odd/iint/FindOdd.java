package find.the.odd.iint;

import java.util.*;

public class FindOdd {
    public static void main(String[] args) {
        int[] a = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (int j : a) {
            hp.put(j, hp.getOrDefault(j, 0) + 1);
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
