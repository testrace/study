package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LottoPriceTest {

    @Test
    @DisplayName("구입 가격에 따른 로또 장 수")
    void ticket_per_price() throws Exception {
        //given
        int price = 14_000;

        //when
        int actual = LottoPrice.ticketPer(price);

        //then
        assertThat(actual).isEqualTo(14);

    }

}
