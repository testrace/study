package problem.step06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step05.Q1546;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q15596Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int[] enter, long expected) throws Exception {
        assertThat(new Q15596().sum(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6)
        );
    }
}