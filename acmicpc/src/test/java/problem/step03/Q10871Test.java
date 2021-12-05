package problem.step03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10871Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, String arr, int[] expected) throws Exception {
        assertThat(Q10871.solution(x, arr)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, "1 10 4 9 2 3 8 5 7 6", new int[]{1, 4, 2, 3})
        );
    }
}