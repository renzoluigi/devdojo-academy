package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringBuilderTest01 { // StringBuilder
    public static void main(String[] args) {
        String nome = "Renzo";
        nome.concat(" Luigi");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Renzo"); // By default, the capacity is 16, but as we're concatenating, the capacity doubles
        sb.append(" Luigi").append(" Marques");
        System.out.println(sb);

        sb.substring(0, 2); // Returns a String
        sb.reverse(); // Returns a substring
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

    }
}
