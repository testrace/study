package chapter01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission11Test {

    @ParameterizedTest
    @CsvSource(value = {
            "KKHSSSSSSSE|K2HS7E",
            "KSTTTSEEKFKKKDJJGG|KST3SE2KFK3DJ2G2",
    }, delimiter = '|')
    void test(String enter, String expected) throws Exception {
        //given
        Mission11 mission = new Mission11();

        //when
        String actual = mission.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}