package chapter04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int k, int[] enter, String expected) throws Exception {
        //given
        Mission03 mission = new Mission03();

        //when
        String actual = mission.solution(n, k, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, 4, new int[]{20, 12, 20 ,10, 23, 17, 10}, "3 4 4 3")
        );
    }
}