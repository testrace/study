package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q3052Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int[] enter, int expected) throws Exception {
        assertThat(Q3052.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10}, 10),
                Arguments.of(new int[]{42,
                        84,
                        252,
                        420,
                        840,
                        126,
                        42,
                        84,
                        420,
                        126}, 1),
                Arguments.of(new int[]{39,
                        40,
                        41,
                        42,
                        43,
                        44,
                        82,
                        83,
                        84,
                        85}, 6)
        );
    }
}