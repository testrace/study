package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission09Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int cnt, int[][] enter, int expected) throws Exception {
        //given
        Mission09 mission = new Mission09();

        //when
        int actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("5",
                        new int[][]{{10, 13, 10, 12, 15},{12, 39, 30, 23, 11},{11, 25, 50, 53, 15},{19, 27, 29, 37, 27},{19, 13, 30, 13, 19}},
                        "155")
        );
    }
}