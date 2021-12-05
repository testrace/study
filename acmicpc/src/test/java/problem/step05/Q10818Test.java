package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10818Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int[] enter, int[] expected) throws Exception {
        assertThat(Q10818.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{20, 10, 35, 30, 7}, new int[]{7, 35})
        );
    }
}