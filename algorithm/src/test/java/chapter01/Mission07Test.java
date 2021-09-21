package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission07Test {

    @ParameterizedTest
    @CsvSource(value = {
            "gooG, YES",
    })
    void test(String enter, String expected) throws Exception {
        //given
        Mission07 mission07 = new Mission07();

        //when
        String actual = mission07.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}