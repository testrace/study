package calculator;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest(name = "문자열 덧셈 {index} [{arguments}]")
    @DisplayName("문자열을 분리하여 덧셈")
    @MethodSource("add")
    void add(String input, int expected) throws Exception {
        //when
        int actual = Calculator.add(input);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> add() {
        return Stream.of(
                Arguments.of("1,2:3", 6),
                Arguments.of("//;\n1;2;3", 6)
        );
    }
}