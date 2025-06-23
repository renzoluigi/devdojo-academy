package academy.devdojo.javaoneforall.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi0 Eren7 Ikasa1, true, 200";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
