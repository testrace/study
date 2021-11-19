package lotto.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Lottos {
    private static final int DEFAULT_MATCHING_COUNT = 0;
    private static final int INCREMENT_UNIT = 1;

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public Map<Integer, Integer> matchResult(WinningLotto winningLotto) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Lotto lotto : lottos) {
            int matchingCount = winningLotto.matchingCount(lotto);
            result.put(matchingCount, result.getOrDefault(matchingCount, DEFAULT_MATCHING_COUNT) + INCREMENT_UNIT);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lottos lottos1 = (Lottos) o;
        return Objects.equals(lottos, lottos1.lottos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottos);
    }
}
