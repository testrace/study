package lotto.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultLottoGenerator {

    private DefaultLottoGenerator() {
        throw new AssertionError();
    }

    public static Lotto create() {
        return Lotto.from(generateLottoNumbers(1, 2, 3, 4, 5, 6));
    }

    public static Lotto generateLotto(int... numbers) {
        return Arrays.stream(numbers)
                .mapToObj(LottoNumber::from)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Lotto::from));
    }

    public static List<LottoNumber> generateLottoNumbers(int... numbers) {
        return Arrays.stream(numbers)
                .mapToObj(LottoNumber::from)
                .collect(Collectors.toList());
    }

}
