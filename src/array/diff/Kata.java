package array.diff;

import java.util.*;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        return Arrays.stream(a).filter(i -> Arrays.stream(b).noneMatch(j -> i == j)).toArray();
    }
}
