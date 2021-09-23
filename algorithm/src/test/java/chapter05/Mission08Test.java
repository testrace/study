package chapter05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission08Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[] enter, int expected) throws Exception {
        //given
        Mission08 mission = new Mission08();

        //when
        int actual = mission.solution(n, m, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 2, new int[]{60, 50, 70, 80, 90}, 3),
                Arguments.of(6, 3, new int[]{70, 60, 90, 60, 60, 60}, 4)
        );
    }
}