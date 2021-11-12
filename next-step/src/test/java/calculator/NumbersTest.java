package calculator;

import calculator.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    private final String[] input = {"1", "2", "3"};

    @Test
    @DisplayName("객체 생성")
    void construct() throws Exception {
        //when
        Numbers actual = Numbers.from(input);

        //then
        assertThat(actual).isEqualTo(Numbers.from(input));
    }

    @Test
    @DisplayName("숫자 합산")
    void sum() throws Exception {
        //given
        Numbers numbers = Numbers.from(input);

        //when
        int actual = numbers.sum();

        //then
        assertThat(actual).isEqualTo(6);

    }

}
