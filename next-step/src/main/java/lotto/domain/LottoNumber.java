package lotto.domain;

import java.util.Objects;

public class LottoNumber implements Comparable<LottoNumber> {

    public static final int MIN = 1;
    public static final int MAX = 45;

    private final int value;

    private LottoNumber(int value) {
        this.value = value;
    }

    public static LottoNumber from(int lottoNumber) {
        validate(lottoNumber);
        return LottoNumberCache.cache[lottoNumber];
    }

    private static void validate(int value) {
        if (isInvalidRange(value)) {
            throw new LottoNumberException(value);
        }
    }

    private static boolean isInvalidRange(int value) {
        return value < MIN || value > MAX;
    }

    public int value() {
        return value;
    }

    @Override
    public int compareTo(LottoNumber other) {
        return Integer.compare(this.value, other.value());
    }

    private static class LottoNumberCache {


        static final LottoNumber[] cache;

        static {
            cache = new LottoNumber[MAX + 1];

            for (int i = MIN; i < MAX; i++) {
                cache[i] = new LottoNumber(i);
            }
        }

        private LottoNumberCache() {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
