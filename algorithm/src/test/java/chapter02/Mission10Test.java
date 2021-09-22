package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission10Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int cnt, int[][] enter, int expected) throws Exception {
        //given
        Mission10 mission = new Mission10();

        //when
        int actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("5",
                        new int[][]{{5, 3, 7, 2, 3},{3, 7, 1, 6, 1},{7, 2, 5, 3, 4},{4, 3, 6, 4, 1},{8, 7, 3, 5, 2}},
                        "10")
        );
    }
}