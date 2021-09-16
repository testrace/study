package weekly.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] weights, String[] head2head, int[] expected) throws Exception {
        //given
        Week06 week06 = new Week06();

        //when
        int[] solution = week06.solution(weights, head2head);

        //then
        assertThat(solution).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{50, 82, 75, 120}, new String[]{"NLWL", "WNLL", "LWNW", "WWLN"}, new int[]{3, 4, 1, 2}),
                Arguments.of(new int[]{145, 92, 86}, new String[]{"NLW", "WNL", "LWN"}, new int[]{2, 3, 1}),
                Arguments.of(new int[]{60, 70, 60}, new String[]{"NNN", "NNN", "NNN"}, new int[]{2, 1, 3}),
                Arguments.of(new int[]{}, new String[]{}, new int[]{})
        );
    }

}