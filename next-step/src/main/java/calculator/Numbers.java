package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Numbers {

    private final List<StringNumber> values;

    public Numbers(List<StringNumber> numbers) {
        this.values = numbers;
    }

    public static Numbers from(String[] input) {
        return new Numbers(Arrays.stream(input)
                .map(StringNumber::valueOf)
                .collect(Collectors.toList()));
    }

    public int sum() {
        return values.stream()
                .mapToInt(StringNumber::value)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return Objects.equals(values, numbers.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
