package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int expected) throws Exception {
        //given
        Mission03 mission = new Mission03();

        //when
        int actual = mission.solution(n);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 120)
        );
    }
}