package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String cnt, String enter, String expected) throws Exception {
        //given
        Mission07 mission = new Mission07();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
          Arguments.of("10", "1 0 1 1 1 0 0 1 1 0", "10")
        );
    }
}