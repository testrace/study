package problem.step01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step01.Q2588;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2588Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int first, int second, int[] expected) throws Exception {
        assertThat(Q2588.solution(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(472, 385, new int[]{2360, 3776, 1416, 181720})
        );
    }
}