package chapter03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission05Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int expected) throws Exception {
        //given
        Mission05 mission = new Mission05();

        //when
        int actual = mission.solution(n);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(15, "3"),
                Arguments.of(14, "1"),
                Arguments.of(25, "2")
        );
    }
}