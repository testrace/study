package chapter04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission05Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int k, int[] enter, int expected) throws Exception {
        //given
        Mission05 mission = new Mission05();

        //when
        int actual = mission.solution(n, k, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("10", "3", new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42}, 143)
        );
    }
}