package problem.step01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step01.Q10869;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10869Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int first, int second, int[] expected) throws Exception {
        assertThat(Q10869.solution(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, 3, new int[]{10, 4, 21, 2, 1})
        );
    }
}