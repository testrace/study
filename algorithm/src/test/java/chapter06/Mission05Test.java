package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission05Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[] enter, String expected) throws Exception {
        //given
        Mission05 mission = new Mission05();

        //when
        String actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(8, new int[]{20, 25, 52, 30, 39, 33, 43, 33}, "D"),
                Arguments.of(10, new int[]{58, 50, 36, 11, 10, 95, 48, 51, 54, 62}, "U")
        );
    }
}