package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission11Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int cnt, int[][] enter, int expected) throws Exception {
        //given
        Mission11 mission = new Mission11();

        //when
        int actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("5",
                        new int[][]{
                                {2, 3, 1, 7, 3},
                                {4, 1, 9, 6, 8},
                                {5, 5, 2, 4, 4},
                                {6, 5, 2, 6, 7},
                                {8, 4, 2, 2, 2}},
                        "4")
        );
    }
}