package step08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import problem.step07.Q1316;
import problem.step08.Q1712;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1712Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q1712.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("1000 70 170", 11),
                Arguments.of("3 2 1", -1),
                Arguments.of("2100000000 9 10", 2100000001)
        );
    }

}