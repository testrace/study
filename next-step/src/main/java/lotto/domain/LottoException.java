package lotto.domain;

public class LottoException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "로또는 6개의 번호로 생성 가능합니다.";

    public LottoException() {
        super(DEFAULT_MESSAGE);
    }

}
