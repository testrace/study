package chapter05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int k, int expected) throws Exception {
        //given
        Mission06 mission = new Mission06();

        //when
        int actual = mission.solution(n, k);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(8, 3, 7)
        );
    }
}