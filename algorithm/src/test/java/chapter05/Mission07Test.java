package chapter05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String require, String subject, String expected) throws Exception {
        //given
        Mission07 mission = new Mission07();

        //when
        String actual = mission.solution(require, subject);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("CBA", "CADBGE", "NO"),
                Arguments.of("CBA", "CBDAGE", "YES"),
                Arguments.of("CBA", "CDBGAE", "YES")
        );
    }
}