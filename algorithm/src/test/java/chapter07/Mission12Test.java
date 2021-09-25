package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission12Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[][] enter, int expected) throws Exception {
        //given
        Mission12 mission = new Mission12();

        //when
        int actual = mission.solution(n, m, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 9, new int[][]{
                        {1, 2},
                        {1, 3},
                        {1, 4},
                        {2, 1},
                        {2, 3},
                        {2, 5},
                        {3, 4},
                        {4, 2},
                        {4, 5}
                }, 6)
        );
    }
}