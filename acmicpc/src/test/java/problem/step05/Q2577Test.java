package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2577Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int enter, int[] expected) throws Exception {
        assertThat(Q2577.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(150 * 266 * 427, new int[]{3, 1, 0, 2, 0, 0, 0, 2, 0, 0})
        );
    }
}