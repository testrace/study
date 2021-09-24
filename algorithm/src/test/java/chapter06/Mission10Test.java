package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission10Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[] enter, int expected) throws Exception {
        //given
        Mission10 mission = new Mission10();

        //when
        int actual = mission.solution(n, m, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 3, new int[]{1, 2, 8, 4, 9}, 3)
                );
    }
}