package problem.step03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2742Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, int[] expected) throws Exception {
        assertThat(Q2742.solution(x)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, new int[] {
                        5,
                        4,
                        3,
                        2,
                        1,
                })
        );
    }
}