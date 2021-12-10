package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2675Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int n, String[] enter, String[] expected) throws Exception {
        assertThat(Q2675.solution(n, enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, new String[]{
                        "3 ABC",
                        "5 /HTP"
                        },
                        new String[]{
                            "AAABBBCCC",
                             "/////HHHHHTTTTTPPPPP"
                        })
        );
    }
}