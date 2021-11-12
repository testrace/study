package lotto.domain;

public class LottoNumberException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "로또 번호는 범위는 1 ~ 45 입니다. 현재 번호 : %d";

    public LottoNumberException(int lottoNumber) {
        super(String.format(DEFAULT_MESSAGE, lottoNumber));
    }
}
