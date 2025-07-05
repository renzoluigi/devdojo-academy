package academy.devdojo.javaoneforall.javacore.ZZAinternclasses.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        private void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // Inner
            System.out.println(OuterClassesTest01.this); // Outer
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner1 = outerClass.new Inner();
        // or
        Inner inner2 = new OuterClassesTest01().new Inner();

        inner1.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
