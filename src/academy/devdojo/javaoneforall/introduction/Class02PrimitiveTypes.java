package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {

    public static void main(String[] args) {
        // Primitive types: (can be cast)
        byte myByte = 10; // -128 to 127 -> 128 = 1000 0000
        short myShort = 10;
        int myInt = (int) 1000000000000000000L;
        long myLong = 10;
        float myFloat = (float) 2000.0D; // generally he is 2000.0F
        double myDouble = 10.9;
        boolean myBoolean = true;
        char myChar = 65535;
        char myCharUnicode = '\u0041';

//        var address = "rere"; // added on java 10

        // Reference types: (can be null)
        String name = "Renzo";
        String address = null;
        Integer age = null;

        // Test zone:
        System.out.println(myChar);
        System.out.println(myCharUnicode);

        System.out.println(myInt);
        System.out.println(myFloat);

    }
}
