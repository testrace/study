package nextstep.chapter02;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @DisplayName("물자열을 구분자를 기준으로 분리한다.")
    @ParameterizedTest
    @CsvSource(value = {
        "  =0",
        "1,2=2",
        "1,2,3=3",
        "1,2:3=3",
    }, delimiter = '=')
    void splitStringByDefaultSeparators(String text, int expected) {
        //when
        int[] numbers = calculator.split(text);

        //then
        assertEquals(expected, numbers.length);
    }

    @DisplayName("문자열을 커스텀 구분자를 기준으로 분리한다.")
    @Test
    void splitStringByCustomSeparators() {
        int[] numbers = calculator.split("//;\n1;2;3");

        //then
        assertEquals(3, numbers.length);
    }

    @DisplayName("음수는 계산할 수 없기 때문에 예외를 발생한다")
    @ParameterizedTest
    @CsvSource({
        "1:-2",
        "-3",
    })
    void exceptionThrowsMinusNumber(String minus) {
        assertThrows(IllegalArgumentException.class, () -> calculator.split(minus));
    }

    @DisplayName("문자열을 구분자로 분리하여 각 숫자의 합을 더한다")
    @ParameterizedTest
    @CsvSource(value = {
        "  =0",
        "1,2=3",
        "1,2,3=6",
        "1,2:3=6",
    }, delimiter = '=')
    void add(String text, int expected) {
        //when
        int number = calculator.add(text);

        //then
        assertEquals(expected, number);

    }

}
