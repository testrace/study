package step08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step08.Q1712;
import problem.step08.Q2292;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2292Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int enter, int expected) throws Exception {
        assertThat(Q2292.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("13", 3),
                Arguments.of("58", 5)
        );
    }

}