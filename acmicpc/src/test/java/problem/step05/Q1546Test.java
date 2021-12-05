package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1546Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, double expected) throws Exception {
        assertThat(Q1546.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("40 80 60", 75.0),
                Arguments.of("10 20 30", 66.666667),
                Arguments.of("1 100 100 100", 75.25),
                Arguments.of("1 2 4 8 16", 38.75),
                Arguments.of("3 10", 65.0),
                Arguments.of("10 20 0 100", 32.5),
                Arguments.of("50", 100.0),
                Arguments.of("10 20 30 40 50 60 70 80 90", 55.55555555555556)
        );
    }
}