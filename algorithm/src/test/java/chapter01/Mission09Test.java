package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission09Test {

    @ParameterizedTest
    @CsvSource(value = {
            "g0en2T0s8eSoft| 208",
            "g00000000000en2T0s8eSoft| 208",
    }, delimiter = '|')
    void test(String enter, String expected) throws Exception {
        //given
        Mission09 mission09 = new Mission09();

        //when
        String actual = mission09.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}