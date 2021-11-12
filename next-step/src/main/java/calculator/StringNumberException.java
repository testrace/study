package calculator;

public class StringNumberException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "0 이상의 숫자만 입력 가능합니다.";

    public StringNumberException() {
        super(DEFAULT_MESSAGE);
    }
}
