package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission08Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String cnt, String enter, String expected) throws Exception {
        //given
        Mission08 mission = new Mission08();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
          Arguments.of("5", "87 89 92 100 76", "4 3 2 1 5"),
          Arguments.of("5", "92 89 92 100 76", "2 4 2 1 5")
        );
    }
}