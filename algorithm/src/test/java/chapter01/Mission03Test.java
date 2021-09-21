package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Mission03Test {

    @Test
    void test() throws Exception {
        //given
        Mission03 mission03 = new Mission03();

        //when
        String actual = mission03.solution("it is time to study");

        //then
        assertThat(actual).isEqualTo("study");

    }
}