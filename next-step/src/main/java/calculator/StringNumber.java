package calculator;

import java.util.Objects;

public class StringNumber {

    private static final int ZERO = 0;

    private final int value;

    private StringNumber(int value) {
        this.value = value;
    }

    public static StringNumber valueOf(String number) {
        return new StringNumber(parseInt(number));
    }

    private static int parseInt(String stringNumber) {
        int number = toInt(stringNumber);

        validatePositive(number);
        return number;
    }

    private static int toInt(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            throw new StringNumberException();
        }
    }

    private static void validatePositive(int number) {
        if (number < ZERO) {
            throw new StringNumberException();
        }
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringNumber that = (StringNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
