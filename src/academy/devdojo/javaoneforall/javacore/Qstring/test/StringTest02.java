package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "  Luffy  ";
        String numbers = "012345";

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.trim());

        System.out.println("-------");

        System.out.println(numbers.length());
        System.out.println(numbers.substring(0, 5)); // inclusive and exclusive
        System.out.println(numbers.substring(1));
    }
}
