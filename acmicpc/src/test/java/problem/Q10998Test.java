package problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q10998Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(int first, int second, int expected) throws Exception {
        assertThat(Q10998.solution(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(3, 4, 12)
        );
    }
}