package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type yout full name: ");
//        String next = scanner.next(); // String -> Read only the first one
        String name = scanner.nextLine(); // String -> Read the line]
        System.out.print("Please type your age: ");
        int age = scanner.nextInt();
        System.out.print("Please type your gender [M or F]: ");
        char gender = scanner.next().charAt(0);
        System.out.println("Hello " + name + " your age is " + age + " and your gender is " + gender);
    }
}
