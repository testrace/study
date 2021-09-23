package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission02Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[] enter, int[] expected) throws Exception {
        //given
        Mission02 mission = new Mission02();

        //when
        int[] actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(6, new int[]{13, 5, 11, 7, 23, 15}, new int[]{5, 7, 11, 13, 15, 23})
        );
    }
}