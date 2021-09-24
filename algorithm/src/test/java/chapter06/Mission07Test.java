package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[][] enter, int[][] expected) throws Exception {
        //given
        Mission07 mission = new Mission07();

        //when
        int[][] actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, new int[][]{
                        {2, 7},
                        {1, 3},
                        {1, 2},
                        {2, 5},
                        {3, 6}
                }, new int[][]{
                        {1, 2},
                        {1, 3},
                        {2, 5},
                        {2, 7},
                        {3, 6}
                })
        );
    }
}