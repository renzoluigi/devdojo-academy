package academy.devdojo.javaoneforall.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR")); // don't need to pass the locale, because he already is "pt_BR"
        System.out.println(resourceBundle.containsKey("hello"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle.getString("hi"));

        resourceBundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));

        resourceBundle = ResourceBundle.getBundle("messages", new Locale("fr", "CA"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
    }
}
