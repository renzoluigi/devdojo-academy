package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "fulano@gmail.com , 123stranger@gm1ail.com, 32##1aaReeznzo@mail.com, Renzo@MAIL.com," +
                "allan223@hotmail.com, rober to@bol.com.br, souzalima@alal";

        System.out.println("Valid email: " + "#aaa@!albert@gmail.com.br".matches(regex)); // Verify if only this one matches the regex

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " + text);
        System.out.println("regex: " + regex);
        System.out.println("index: 0123456789");

        while (matcher.find()) {
            System.out.println("Index: " + matcher.start() + " Found:" + matcher.group()+ " ");
        }
    }
}
