package calculator;

public class Calculator {

    private Calculator() {
        throw new AssertionError();
    }

    public static int add(String input) {
        Numbers numbers = StringSplitter.split(input);
        return numbers.sum();
    }
}
