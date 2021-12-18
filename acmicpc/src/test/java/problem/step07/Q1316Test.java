package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1316Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String[] enter, int expected) throws Exception {
        assertThat(Q1316.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{
                        "happy",
                        "new",
                        "year",
                }, 3),
                Arguments.of(new String[]{
                        "aba",
                        "abab",
                        "abcabc",
                        "a",
                }, 1),
                Arguments.of(new String[]{
                        "ab",
                        "aa",
                        "aca",
                        "ba",
                        "bb",
                }, 4),
                Arguments.of(new String[]{
                        "yzyzy",
                        "zyzyz",
                }, 0),
                Arguments.of(new String[]{
                        "z",
                }, 1)
        );
    }

}