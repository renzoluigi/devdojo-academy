package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(i, i);
            System.out.println("position " + i + ": " + arr[i]);
        }

        arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("position " + i + ": " + arr[i]);
        }
    }
}
