package chapter08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int k, int expected) throws Exception {

        //when
        int actual = Mission07.solution(n, k);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 3, 10),
                Arguments.of(33, 19, 818809200)
        );
    }
}