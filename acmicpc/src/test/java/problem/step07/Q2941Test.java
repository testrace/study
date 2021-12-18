package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q2941Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q2941.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("ljes=njak", 6),
                Arguments.of("ddz=z=", 3),
                Arguments.of("nljj", 3),
                Arguments.of("c=c=", 2),
                Arguments.of("dz=ak", 3)
        );
    }

}