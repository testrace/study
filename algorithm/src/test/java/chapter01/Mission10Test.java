package chapter01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Mission10Test {

    @ParameterizedTest
    @CsvSource(value = {
            "teachermode e| 1 0 1 2 1 0 1 2 2 1 0",
            "applebananamango a| 0 1 2 3 2 1 0 1 0 1 0 1 0 1 2 3",
    }, delimiter = '|')
    void test(String enter, String expected) throws Exception {
        //given
        Mission10 mission10 = new Mission10();

        //when
        String actual = mission10.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
}