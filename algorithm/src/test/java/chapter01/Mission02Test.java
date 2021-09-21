package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Mission02Test {

    @Test
    void test() throws Exception {
        //given
        Mission02 mission02 = new Mission02();

        //when
        String actual = mission02.solution("StuDY");

        //then
        assertThat(actual).isEqualTo("sTUdy");

    }
}