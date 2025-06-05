package academy.devdojo.javaoneforall.introduction;

import java.util.Arrays;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][][] months = new int[2][5][4];
        System.out.println("Months:");
        for (int[][] month : months) {
            System.out.println(Arrays.deepToString(month));
        }
        // Can be declared like this:
        int[][][] days = {{{0, 0}, {0, 0}}, {{0, 0}, {0, 0}}, {{0, 0}, {0, 0}}, {{0, 0}, {0, 0}}}; //new int[4][2][2]
    }
}
