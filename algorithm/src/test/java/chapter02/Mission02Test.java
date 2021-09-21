package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission02Test {

    @ParameterizedTest
    @CsvSource(value = {
            "8|130 135 148 140 145 150 150 153|5",
    }, delimiter = '|')
    void test(int cnt, String enter, String expected) throws Exception {
        //given
        Mission02 mission = new Mission02();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}