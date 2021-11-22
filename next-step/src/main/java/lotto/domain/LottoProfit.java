package lotto.domain;

import java.util.Arrays;

public enum LottoProfit {
    ZERO(0, 0),
    FOURTH(3, 5000),
    THIRD(4, 50000),
    SECOND(5, 1500000),
    FIRST(6, 2_000_000_000);

    private final int count;
    private final int profit;

    LottoProfit(int count, int profit) {
        this.count = count;
        this.profit = profit;
    }

    public static LottoProfit match(int count) {
        return Arrays.stream(values())
                .filter(profit -> profit.matchingCount(count))
                .findFirst()
                .orElse(ZERO);
    }

    private boolean matchingCount(int count) {
        return this.count == count;
    }

}
