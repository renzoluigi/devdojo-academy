package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("folder/subfolder/file.java");
        Path path2 = Paths.get("folder/subfolder/file2.bkp");
        Path path3 = Paths.get("folder/subfolder/file.txt");

        matches(path2, "glob:*.bkp"); // considering only files
        matches(path2, "glob:**.bkp"); // considering directories too, or (glob:**/*.)

        matches(path1, "glob:**/*.{bkp,txt,java}"); // grouping (can't have spaces between there)
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");

        matches(path1, "glob:**/*.???"); // 3 letters after dot
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

        matches(path1, "glob:**/file.????");
        matches(path2, "glob:**/file.????");
        matches(path3, "glob:**/file.????");

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob); // Glob works like regex
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
