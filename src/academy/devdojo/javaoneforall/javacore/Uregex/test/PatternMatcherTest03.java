package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String text = "12 0  0xxffa1  xf 0x 0xfabcg 0xH 0xA1B09 0x4";
        String regex = "0[xX]([a-fA-F0-9])+(\\s|$)"; // 0 + x/X + from a to f or A to F or 0 to 9 + (space or end of the line)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " + text);
        System.out.println("regex: " + regex);
        System.out.println("index: 0123456789");

        while (matcher.find()) { // While finding the regular expression
            System.out.println("Index: " + matcher.start() + " Found:" + matcher.group() + " ");
        }
    }
}
