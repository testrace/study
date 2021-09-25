package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission10Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int s, int e, int expected) throws Exception {
        //given
        Mission10 mission = new Mission10();

        //when
        int actual = mission.solution(s, e);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 3, 1),
                Arguments.of(6, 3, 1),
                Arguments.of(13, 7, 2),
                Arguments.of(14, 7, 2)
        );
    }
}