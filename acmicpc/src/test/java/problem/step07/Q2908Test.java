package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2908Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q2908.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("734 893", 437),
                Arguments.of("221 231", 132),
                Arguments.of("839 237", 938)
        );
    }
}