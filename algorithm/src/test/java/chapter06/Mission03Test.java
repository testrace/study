package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[] enter, int[] expected) throws Exception {
        //given
        Mission03 mission = new Mission03();

        //when
        int[] actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(6, new int[]{11, 7, 5, 6, 10, 9}, new int[]{5, 6, 7, 9, 10, 11})
        );
    }
}