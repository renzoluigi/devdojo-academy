package academy.devdojo.javaoneforall.javacore.Uregex.test;


import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Ikasa,true,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(","); // Defines the delimiter

        while (scanner.hasNext()) { // While have elements in the string
            if (scanner.hasNextInt()) { // If the next element can be converted to int
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) { // If the next element can be converted to boolean
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
