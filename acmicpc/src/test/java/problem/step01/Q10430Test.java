package problem.step01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step01.Q10430;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10430Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int first, int second, int third, int[] expected) throws Exception {
        assertThat(Q10430.solution(first, second, third)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 8, 4, new int[]{1, 1, 0, 0})
        );
    }
}