package lotto.domain;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoShop {

    private LottoShop() {
        throw new AssertionError();
    }

    public static Lottos buy(Money money) {
        int ticketCount = LottoPrice.ticketPer(money);
        return IntStream.range(0, ticketCount)
                .mapToObj(i -> LottoNumberGenerator.shuffle())
                .map(Lotto::from)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Lottos::new));
    }
}
