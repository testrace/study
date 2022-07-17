package nextstep.chapter02;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static final String DEFAULT_SEPARATOR = "[,:]";
    private static final Pattern CUSTOM_SEPARATOR = Pattern.compile("//(.)\n(.*)");


    public int add(String text) {
        int[] ints = split(text);

        return Arrays.stream(ints)
            .sum();
    }

    public int[] split(String s) {
        if (invalidText(s)) {
            return new int[0];
        }

        Matcher matcher = CUSTOM_SEPARATOR.matcher(s);

        if (matcher.find()) {
            String customSeparator = matcher.group(1);
            String customText = matcher.group(2);
            return getInts(customSeparator, customText);
        }

        return getInts(DEFAULT_SEPARATOR, s);
    }

    private int[] getInts(String customSeparator, String customText) {
        String[] texts = customText.split(customSeparator);

        return Arrays.stream(texts)
            .mapToInt(this::toInt)
            .toArray();
    }

    private int toInt(String value) {
        int number = Integer.parseInt(value);
        validateNegative(number);

        return number;
    }

    private void validateNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
    }

    private boolean invalidText(String s) {
        return Objects.isNull(s) || s.isBlank();
    }

}
