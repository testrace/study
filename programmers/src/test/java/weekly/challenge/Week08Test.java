package weekly.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week08Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int[][] sizes, int expected) throws Exception {
        //given

        //when
        int solution = Week08.solution(sizes);

        //then
        assertThat(solution).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}, 4000),
                Arguments.of(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}, 120),
                Arguments.of(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}, 133)
        );
    }

}