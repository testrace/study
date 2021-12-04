package problem.step02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2884Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, int y, int[] expected) throws Exception {
        assertThat(Q2884.solution(x, y)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(10, 10, new int[]{9, 25}),
                Arguments.of(0, 30, new int[]{23, 45}),
                Arguments.of(23, 40, new int[]{22, 55})
        );
    }
}