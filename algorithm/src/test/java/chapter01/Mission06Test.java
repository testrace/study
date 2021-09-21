package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission06Test {

    @ParameterizedTest
    @CsvSource(value = {
            "ksekkset, kset",
    })
    void test(String enter, String expected) throws Exception {
        //given
        Mission06 mission06 = new Mission06();

        //when
        String actual = mission06.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}