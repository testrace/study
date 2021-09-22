package chapter05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[][] board, int cnt, int[] moves, int expected) throws Exception {
        //given
        Mission03 mission = new Mission03();

        //when
        int actual = mission.solution(n, board, cnt, moves);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5,
                        new int[][]{
                                {0, 0, 0, 0, 0},
                                {0, 0, 1, 0, 3},
                                {0, 2, 5, 0, 1},
                                {4, 2, 4, 4, 2},
                                {3, 5, 1, 3, 1},
                        },
                        8, new int[]{1, 5, 3, 5, 1, 2, 1, 4}, 4
                    )
        );
    }
}