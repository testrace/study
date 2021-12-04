package problem.step02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2753Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int year, int expected) throws Exception {
        assertThat(Q2753.solution(year)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2000, 1),
                Arguments.of(1999, 0),
                Arguments.of(2012, 1),
                Arguments.of(2000, 1),
                Arguments.of(1900, 0)
        );
    }
}