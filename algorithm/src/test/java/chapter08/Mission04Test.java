package chapter08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission04Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[][] expected) throws Exception {
        //given
        Mission04 mission = new Mission04();

        //when
        int[][] actual = mission.solution(n, m);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(3, 2, new int[][]{
                        {1, 1},
                        {1, 2},
                        {1, 3},
                        {2, 1},
                        {2, 2},
                        {2, 3},
                        {3, 1},
                        {3, 2},
                        {3, 3},
                })
        );
    }
}