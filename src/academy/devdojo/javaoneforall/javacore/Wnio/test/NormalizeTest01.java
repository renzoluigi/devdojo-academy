package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDirectory = "home/renzo/dev";
        String fileTxt = "../../file.txt"; // Go back 2 directories and access file.txt
        Path path1 = Paths.get(projectDirectory, fileTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./renzo/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
