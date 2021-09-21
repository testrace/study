package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission04Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String enter, String expected) throws Exception {
        //given
        Mission04 mission = new Mission04();

        //when
        String actual = mission.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
          Arguments.of("10", "1 1 2 3 5 8 13 21 34 55")
        );
    }
}