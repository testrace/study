package problem.step07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Q1152Test {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @MethodSource
    void test(String enter, int expected) throws Exception {
        assertThat(Q1152.solution(enter)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("The Curious Case of Benjamin Button", 6),
                Arguments.of("The first character is a blank", 6),
                Arguments.of("The last character is a blank ", 6),
                Arguments.of(" The last character is a blank ", 6),
                Arguments.of("a", 1),
                Arguments.of(" a", 1),
                Arguments.of("a ", 1),
                Arguments.of(" a ", 1),
                Arguments.of("  ", 0),
                Arguments.of(" ", 0),
                Arguments.of("", 0)


        );
    }
}