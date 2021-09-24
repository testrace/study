package chapter07;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, List<String> expected) throws Exception {
        //given
        Mission07 mission = new Mission07();

        //when
        List<String> actual = mission.solution(n);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, Arrays.asList(
                        "1",
                        "2 3",
                        "4 5 6 7"
                ))
        );
    }
}