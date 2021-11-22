package lotto.domain;

public class LottoPrice {

    public static final int PRICE_PER_TICKET = 1_000;

    private LottoPrice() {
        throw new AssertionError();
    }

    public static int ticketPer(Money price) {
        return price.value() / PRICE_PER_TICKET;
    }

}
