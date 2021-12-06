package problem.step05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q4344Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String[] enter, String[] expected) throws Exception {
        assertThat(Q4344.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{
                        "5 50 50 70 80 100",
                        "7 100 95 90 80 70 60 50",
                        "3 70 90 80",
                        "3 70 90 81",
                        "9 100 99 98 97 96 95 94 93 91",
                }, new String[] {
                        "40.000",
                        "57.143",
                        "33.333",
                        "66.667",
                        "55.556",
                })
        );
    }
}