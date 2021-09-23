package chapter05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission05Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String enter, int expected) throws Exception {
        //given
        Mission05 mission = new Mission05();

        //when
        int actual = mission.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("(())", 2),
                Arguments.of("(()())", 3),
                Arguments.of("()(((()())(())()))(())", 17),
                Arguments.of("(((()(()()))(())()))(()())", 24)
        );
    }
}