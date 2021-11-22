package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @Test
    @DisplayName("금액 생성")
    void construct() throws Exception {
        //given
        int money = 1_000;

        //when
        Money actual = new Money(money);

        //then
        assertThat(actual).isEqualTo(new Money(money));

    }

}
