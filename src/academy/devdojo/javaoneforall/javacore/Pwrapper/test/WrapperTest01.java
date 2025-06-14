package academy.devdojo.javaoneforall.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Primitive Types aren't objects, he doesn't have methods
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F   ;
        double doubleP = 1.9;
        boolean booleanP = false;
        char charP = 'c';

        // Reference Types / Wrappers
        // Here we work with objects, so integers cannot be longs (because of inheritance), like primitive types
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1.9;
        Boolean booleanW = false;
        Character charW = 'c';

        int i = intW.shortValue();
        Integer intW2 = Integer.parseInt("1");
        int intW3 = new Integer("1"); // Since Java 9 this has been deprecated

        boolean booleanW2 = new Boolean("TruE"); // Ignore case
        boolean booleanW3 = Boolean.parseBoolean("BooLEAN"); // or null results in false

        System.out.println(booleanW2);
        System.out.println(booleanW3);

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.toLowerCase(charW));
    }
}


