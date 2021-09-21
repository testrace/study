package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String cnt, String enter, String expected) throws Exception {
        //given
        Mission06 mission = new Mission06();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
          Arguments.of("9", "32 55 62 20 250 370 200 30 100", "23 2 73 2 3")
        );
    }
}