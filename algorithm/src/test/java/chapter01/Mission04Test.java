package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Mission04Test {

    @Test
    void test() throws Exception {
        //given
        Mission04 mission04 = new Mission04();

        //when
        String actual = mission04.solution("good");

        //then
        assertThat(actual).isEqualTo("doog");

    }
}