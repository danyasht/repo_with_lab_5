package ua.lviv.iot.algo.part1.lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remover {
    public String removeWordsWithLengthFiveWhichStartWithСonsonantLetter() {
        String text = "I'm listening to a great song." + "\n" +
                "We enjoy warm sunsets on the beach." + "\n" +
                "He drives fast cars and loves speed." + "\n" +
                "He reads books for hours on end.";
        String regex = ("\\b[b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|z]\\w{4}\\b");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String editedText = matcher.replaceAll("\"removed word\"");
        System.out.println(editedText);
        return editedText;
    }
}


