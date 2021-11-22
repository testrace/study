package lotto.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LottoShopTest {

    @Test
    void test() throws Exception {
        //given
        Money money = new Money(1_000);
        Lottos lottos = LottoShop.buy(money);;

        //when
        int actual = lottos.ticket();

        //then
        assertThat(actual).isEqualTo(1);

    }

}
