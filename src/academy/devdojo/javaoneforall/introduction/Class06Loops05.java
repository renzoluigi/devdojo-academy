package academy.devdojo.javaoneforall.introduction;

public class Class06Loops05 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5 || i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
