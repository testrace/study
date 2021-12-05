package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2562Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int[] enter, int[] expected) throws Exception {
        assertThat(Q2562.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61}, new int[]{85, 8})
        );
    }
}