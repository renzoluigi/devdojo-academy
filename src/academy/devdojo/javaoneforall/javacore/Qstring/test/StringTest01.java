package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Renzo"; // String constant pool
        String name2 = "Renzo";
        name.concat(" Luigi"); // Create a new string in the String pool, but the name isn't changed (without a refence variable)
        name = name.concat(" Luigi"); // Same as name += " Luigi"
        System.out.println(name);
        System.out.println(name == name2); // Comparing references of the object, not the value

        String name3 = new String("Renzo"); // Create a reference variable, an object outside the pool (normal object) and an object inside the pool (if not exists), but referees to the outside object, if you use the method intern() you can reference the inside object
        System.out.println(name2 == name3); // A comparison of an outside object and an object from the pool
        System.out.println(name2 == name3.intern()); // Comparate to the object value in the pool (if he is in the pool)
    }
}
