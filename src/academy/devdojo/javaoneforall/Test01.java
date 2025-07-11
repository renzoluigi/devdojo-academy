package academy.devdojo.javaoneforall;

public class Test01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,4,5,7,8,9};
        int[] arr2 = new int[]{2,4,6,8,10};
        int[] arr3 = new int[10];

        int count = 0;
        for (int i : arr1) {
            arr3[count] = i;
            count++;
            for (int c : arr2) {
                if (i != c) {

                }
            }
        }
    }
}
