package Lessons.Lesson5;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Date();
       // Text();
    }

    public static void Date() {
        Date date = new Date();
        System.out.println(date);
    }

    public static void Text() {
        String text = "Egor Alla Aleksandr";
        String regex = "A.+?a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
            matcher.replaceFirst("Sveta");
        }
    }
}
