package pl.patrycja.game;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Format {
    DOUBLE("^\\d+\\.\\d+$"), INTEGER("^\\d+$"), NONE("unknown format");

    private String regex;

    Format(String regex) {
        this.regex = regex;
    }

    boolean matches(String input) {
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}