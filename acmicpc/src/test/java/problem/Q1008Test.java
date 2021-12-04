package problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1008Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(double first, double second, double expected) throws Exception {
        assertThat(Q1008.solution(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, 3, 0.33333333333333333333333333333333),
                Arguments.of(4, 5, 0.8)
        );
    }
}