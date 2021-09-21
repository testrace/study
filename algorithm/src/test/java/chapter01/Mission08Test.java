package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission08Test {

    @ParameterizedTest
    @CsvSource(value = {
            "found7, time: study; Yduts; emit, 7Dnuof| YES",
    }, delimiter = '|')
    void test(String enter, String expected) throws Exception {
        //given
        Mission08 mission08 = new Mission08();

        //when
        String actual = mission08.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}