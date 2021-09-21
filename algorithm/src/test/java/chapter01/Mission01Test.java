package chapter01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Mission01Test {

    @Test
    void test() throws Exception {
        //given
        Mission01 mission01 = new Mission01();

        //when
        int actual = mission01.solution("Computercoller", 'c');

        //then
        assertThat(actual).isEqualTo(2);

    }
}