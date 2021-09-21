package chapter02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission01Test {

    @ParameterizedTest
    @CsvSource(value = {
            "6|7 3 9 5 6 12|7 9 6 12",
            "3|3 2 1|3",
            "7|3 2 1 3 2 1 3|3 3 3",
            "12|7 3 10 9 5 6 7 9 20 19 12 15|7 10 6 7 9 20 15 ",
            "14|7 3 10 9 5 6 7 9 20 19 12 11 15 19|7 10 6 7 9 20 15 19",
    }, delimiter = '|')
    void test(int cnt, String enter, String expected) throws Exception {
        //given
        Mission01 mission = new Mission01();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}