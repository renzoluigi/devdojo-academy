package academy.devdojo.javaoneforall.javacore.ZZAinternclasses.test;

public class OuterClassesTest02 {
    private String name = "Renzo";

    void print() {
        class LocalClass {
            String lastName = "Luigi"; // is effectively final
//            name = "";
//            lastName = "";
            public void printLocal() {
                System.out.println(name);
            }

            class LocalLocalClass {
                public void printLocalLocal() {

                }
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
