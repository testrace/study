package problem.step02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step02.Q9498;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q9498Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int score, String expected) throws Exception {
        assertThat(Q9498.solution(score)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(100, "A"),
                Arguments.of(89, "B"),
                Arguments.of(79, "C"),
                Arguments.of(69, "D"),
                Arguments.of(59, "F")
        );
    }
}