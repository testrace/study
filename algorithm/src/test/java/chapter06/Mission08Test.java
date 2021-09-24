package chapter06;

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
                Arguments.of(8, 32, new int[]{23, 87, 65, 12, 57, 32, 99, 81}, 3)
        );
    }
}