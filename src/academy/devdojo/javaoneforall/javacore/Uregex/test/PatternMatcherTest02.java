package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String text2 = "-2p[]__]1    3MAas90ew@ qo9";
        String regex = "\\W";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text: " + text2);
        System.out.println("regex: " + regex);
        System.out.println("index: 0123456789");

        while (matcher.find()) { // While finding the regular expression
            System.out.println("Index: " + matcher.start() + " Found:" + matcher.group() + " ");
        }
    }
}
