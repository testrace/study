package chapter03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission02Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[] narr, int m, int[] marr, String expected) throws Exception {
        //given
        Mission02 mission = new Mission02();

        //when
        String actual = mission.solution(n, narr, m, marr);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, new int[]{1, 3, 9, 5, 2}, 5, new int[]{3, 2, 5, 7, 8}, "2 3 5")
        );
    }
}