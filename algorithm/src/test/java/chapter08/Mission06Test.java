package chapter08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[] k, int[][] expected) throws Exception {

        //when
        int[][] actual = Mission06.solution(n, m, k);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(3, 2, new int[]{3, 6, 9}, new int[][]{
                        {3, 6},
                        {3, 9},
                        {6, 3},
                        {6, 9},
                        {9, 3},
                        {9, 6},
                }),
                Arguments.of(4, 3, new int[]{1, 2, 3, 4}, new int[][]{
                        {1, 2, 3},
                        {1, 2, 4},
                        {1, 3, 2},
                        {1, 3, 4},
                        {1, 4, 2},
                        {1, 4, 3},
                        {2, 1, 3},
                        {2, 1, 4},
                        {2, 3, 1},
                        {2, 3, 4},
                        {2, 4, 1},
                        {2, 4, 3},
                        {3, 1, 2},
                        {3, 1, 4},
                        {3, 2, 1},
                        {3, 2, 4},
                        {3, 4, 1},
                        {3, 4, 2},
                        {4, 1, 2},
                        {4, 1, 3},
                        {4, 2, 1},
                        {4, 2, 3},
                        {4, 3, 1},
                        {4, 3, 2}
                })
        );
    }
}