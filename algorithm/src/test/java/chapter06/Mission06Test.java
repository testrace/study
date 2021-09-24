package chapter06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int[] enter, int[] expected) throws Exception {
        //given
        Mission06 mission = new Mission06();

        //when
        int[] actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(9, new int[]{120, 125, 152, 130, 135, 135, 143, 127, 160}, new int[]{3, 8}),
                Arguments.of(6, new int[]{120, 130, 150, 150, 130, 150}, new int[]{3, 5}),
                Arguments.of(30, new int[]{122, 123, 125, 125, 128, 130, 133, 137, 138, 138, 140, 141, 142, 143, 145, 147, 149, 149, 154, 154, 155, 157, 161, 167, 167, 167, 161, 170, 173, 173}, new int[]{24, 27})
        );
    }
}