package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q8958Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String[] enter, int[] expected) throws Exception {
        assertThat(Q8958.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"OOXXOXXOOO",
                        "OOXXOOXXOO",
                        "OXOXOXOXOXOXOX",
                        "OOOOOOOOOO",
                        "OOOOXOOOOXOOOOX"},
                        new int[]{
                                10,
                                9,
                                7,
                                55,
                                30,
                })
        );
    }
}