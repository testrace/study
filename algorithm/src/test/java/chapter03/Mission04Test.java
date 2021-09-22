package chapter03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission04Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int m, int[] arr, int expected) throws Exception {
        //given
        Mission04 mission = new Mission04();

        //when
        int actual = mission.solution(n, m, arr);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(8, 6, new int[]{1, 2, 1, 3, 1, 1, 1, 2}, "3"),
                Arguments.of(100, 100, new int[]{3, 3, 1, 4, 5, 2, 2, 5, 2, 1, 2, 2, 1, 1, 4, 1, 4, 3, 3, 5, 1, 5, 1, 3, 4, 5, 4, 5, 2, 4, 2, 1, 1, 4, 2, 1, 5, 3, 1, 3, 1, 1, 1, 2, 4, 4, 5, 5, 5, 5, 3, 2, 5, 5, 3, 2, 3, 4, 1, 3, 3, 4, 5, 1, 3, 1, 3, 2, 3, 1, 2, 3, 2, 5, 5, 4, 2, 3, 1, 2, 3, 2, 4, 5, 2, 4, 4, 4, 4, 3, 1, 5, 2, 2, 1, 3, 2, 5, 4, 1}, "23")
        );
    }
}