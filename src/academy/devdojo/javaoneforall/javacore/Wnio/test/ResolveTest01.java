package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/renzo"); // relative (home/)
        Path file = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/william"); // absolute (/home)
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");
        System.out.println("1 " + absolute.resolve(relative).resolve(file2));
        System.out.println("2 " + absolute.resolve(file2));
        System.out.println("3 " + relative.resolve(absolute)); // You can't do this (relative to absolute)
        System.out.println("4 " + relative.resolve(file2));
        System.out.println("5 " + file.resolve(absolute)); // You can't do this (relative to absolute)
        System.out.println("6 " + file.resolve(relative));
    }
}
