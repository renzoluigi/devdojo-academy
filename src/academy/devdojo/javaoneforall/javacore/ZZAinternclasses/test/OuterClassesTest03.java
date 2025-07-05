package academy.devdojo.javaoneforall.javacore.ZZAinternclasses.test;

public class OuterClassesTest03 {
    private String name = "Renzo";

    static class Nested { // Only access static things about class (generally used when have a direct link)
        private String lastName = "Luigi";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested(); // Can be instantiated
        nested.print();
    }
}
