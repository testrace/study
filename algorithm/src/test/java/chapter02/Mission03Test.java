package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int cnt, String enter, String enter2, List<String> expected) throws Exception {
        //given
        Mission03 mission = new Mission03();

        //when
        List<String> actual = mission.solution(cnt, enter, enter2);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
          Arguments.of("5", "2 3 3 1 3", "1 1 2 2 3", Arrays.asList("A","B","A","B","D"))
        );
    }
}