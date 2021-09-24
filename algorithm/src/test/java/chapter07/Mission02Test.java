package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission02Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, String expected) throws Exception {
        //given
        Mission02 mission = new Mission02();

        //when
        String actual = mission.solution(n);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(11, "1011"),
                Arguments.of(123456, "11110001001000000")
        );
    }
}