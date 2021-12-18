package problem.step07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q5622Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q5622.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("WA", 13),
                Arguments.of("UNUCIC", 36)
        );
    }

}