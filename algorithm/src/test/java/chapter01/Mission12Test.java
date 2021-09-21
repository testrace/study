package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission12Test {

    @ParameterizedTest
    @CsvSource(value = {
            "4|#****###**#####**#####**##** |COOL",
    }, delimiter = '|')
    void test(int cnt, String enter, String expected) throws Exception {
        //given
        Mission12 mission = new Mission12();

        //when
        String actual = mission.solution(cnt, enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}