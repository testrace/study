package lotto.domain;

import java.util.*;

public class LottoNumberGenerator {

    private static final int START_RANGE = 0;
    private static final int END_RANGE = 6;
    private static final List<LottoNumber> LOTTO_NUMBERS = new ArrayList<>();

    static {
        for (int i = LottoNumber.MIN; i <= LottoNumber.MAX; i++) {
            LOTTO_NUMBERS.add(LottoNumber.from(i));
        }
    }

    private LottoNumberGenerator() {
        throw new AssertionError();
    }

    public static Set<LottoNumber> shuffle() {
        Collections.shuffle(LOTTO_NUMBERS);

        return selectNumbers();
    }

    private static Set<LottoNumber> selectNumbers() {
        Set<LottoNumber> lottoNumbers = new HashSet<>();
        for (int i = START_RANGE; i < END_RANGE; i++) {
            lottoNumbers.add(LOTTO_NUMBERS.get(i));
        }
        return Collections.unmodifiableSet(lottoNumbers);
    }

}
