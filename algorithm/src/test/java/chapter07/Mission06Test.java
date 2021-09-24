package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, List<String> expected) throws Exception {
        //given
        Mission06 mission = new Mission06();

        //when
        List<String> actual = mission.solution(n);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(3, Arrays.asList(
                        "1 2 3",
                        "1 2",
                        "1 3",
                        "1",
                        "2 3",
                        "2",
                        "3"
                ))
        );
    }
}