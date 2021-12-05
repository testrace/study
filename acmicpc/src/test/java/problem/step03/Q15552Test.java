package problem.step03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q15552Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, String[] enter, int[] expected) throws Exception {
        assertThat(Q15552.solution(x, enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, new String[]{
                        "1 1",
                        "12 34",
                        "5 500",
                        "40 60",
                        "1000 1000",
                }, new int[] {
                        2,
                        46,
                        505,
                        100,
                        2000,
                })
        );
    }
}