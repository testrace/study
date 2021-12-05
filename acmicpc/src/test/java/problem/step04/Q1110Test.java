package problem.step04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1110Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int n, int expected) throws Exception {
        assertThat(Q1110.solution(n)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(26, 4),
                Arguments.of(55, 3),
                Arguments.of(51, 60),
                Arguments.of(71, 12)
        );
    }
}