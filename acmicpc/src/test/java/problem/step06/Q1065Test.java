package problem.step06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1065Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int enter, int expected) throws Exception {
        assertThat(Q1065.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(110, 99),
                Arguments.of(1, 1),
                Arguments.of(210, 105),
                Arguments.of(1000, 144),
                Arguments.of(500, 119)
        );
    }
}