package problem.step03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step02.Q2884;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2739Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, String[] expected) throws Exception {
        assertThat(Q2739.solution(x)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, new String[]{
                        "2 * 1 = 2",
                        "2 * 2 = 4",
                        "2 * 3 = 6",
                        "2 * 4 = 8",
                        "2 * 5 = 10",
                        "2 * 6 = 12",
                        "2 * 7 = 14",
                        "2 * 8 = 16",
                        "2 * 9 = 18"
                })
        );
    }
}