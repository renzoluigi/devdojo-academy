package academy.devdojo.javaoneforall.introduction;

import java.util.Arrays;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0};
        int[][] weeks = new int[5][];
        weeks[0] = new int[]{0, 0, 0}; // only {0, 0, 0} declaration is not allowed in this case
        weeks[1] = numbers; // but we can do this
        weeks[2] = new int[5];
        weeks[4] = new int[7];

        int i = 0;
        for (int[] week: weeks) {
            System.out.println("Week " + i + ":" + Arrays.toString(week));
            i++;
        }
    }
}
