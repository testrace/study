package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission08Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int s, int e, int expected) throws Exception {
        //given
        Mission08 mission = new Mission08();

        //when
        int actual = mission.solution(s, e);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 14, 3)
        );
    }
}