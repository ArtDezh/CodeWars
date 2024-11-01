package array.diff;

import java.util.*;

public class Kata {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5};
        int[] arrB = {2};
        System.out.println(Arrays.toString(arrayDiff(arrA, arrB)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> list = new HashSet<>();

        for (int i: a) {
            list.add(i);
            for (int j: b) {
                list.add(j);
            }
        }

        int[] result = new int[list.size()];
        int count = 0;
        for(Integer i: list) {
            result[count] = (int) i;
            count++;
        }
        return result;
    }
}
