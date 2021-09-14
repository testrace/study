package weekly.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class Week07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] enter, int[] leave, int[] expected) throws Exception {
        //given
        Week07 week07 = new Week07();

        //when
        int[] solution = week07.solution(enter, leave);

        //then
        assertThat(solution).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2}, new int[]{1, 2, 3}, new int[]{0, 1, 1}),
                Arguments.of(new int[]{1, 4, 2, 3}, new int[]{2, 1, 3, 4}, new int[]{2, 2, 1, 3}),
                Arguments.of(new int[]{3, 2, 1}, new int[]{2, 1, 3}, new int[]{1, 1, 2}),
                Arguments.of(new int[]{3, 2, 1}, new int[]{1, 3, 2}, new int[]{2, 2, 2}),
                Arguments.of(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3}, new int[]{2, 2, 0, 2})
        );
    }

}