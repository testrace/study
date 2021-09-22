package chapter04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission01Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, String enter, String expected) throws Exception {
        //given
        Mission01 mission = new Mission01();

        //when
        String actual = mission.solution(n, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(15, "BACBACCACCBDEDE", "C")
        );
    }
}