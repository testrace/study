package problem.step02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step02.Q1330;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1330Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int first, int second, String expected) throws Exception {
        assertThat(Q1330.solution(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, 2, "<"),
                Arguments.of(10, 2, ">"),
                Arguments.of(5, 5, "==")
        );
    }
}