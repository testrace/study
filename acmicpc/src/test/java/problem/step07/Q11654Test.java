package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step06.Q1065;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q11654Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q11654.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("A", 65),
                Arguments.of("0", 48),
                Arguments.of("a", 97)
        );
    }
}