package find.the.parity.outlier;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
    }

    static int find(int[] integers) {
        int flag = 0; // -1 it's odd, +1 it's even
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                flag++;
            } else {
                flag--;
            }
        }

        if (flag < 0) {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    return integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    return integer;
                }
            }
        }
        return 0;
    }
}
