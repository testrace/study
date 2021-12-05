package problem.step03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q11022Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int x, String[] enter, int[] expected) throws Exception {
        assertThat(Q11022.solution(x, enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, new String[] {
                        "1 1",
                        "2 3",
                        "3 4",
                        "9 8",
                        "5 2",
                }, new int[]{
                        2,
                        5,
                        7,
                        17,
                        7
                })
        );
    }
}