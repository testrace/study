package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q11720Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int n, String enter, int expected) throws Exception {
        assertThat(Q11720.solution(n, enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, "1", 1),
                Arguments.of(5, "54321", 15),
                Arguments.of(25, "7000000000000000000000000", 7),
                Arguments.of(11, "10987654321", 46)
        );
    }
}