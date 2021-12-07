package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10809Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int[] expected) throws Exception {
        assertThat(Q10809.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("baekjoon", new int[]{1, 0, -1, -1, 2, -1, -1, -1, -1, 4, 3, -1, -1, 7, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1})
        );
    }
}