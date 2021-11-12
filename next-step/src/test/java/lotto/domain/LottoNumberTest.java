package lotto.domain;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoNumberTest {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @ValueSource(ints = {
            1, 45
    })
    @DisplayName("정상 범위 로또 번호")
    void construct(int lottoNumber) throws Exception {
        //when
        LottoNumber actual = LottoNumber.from(lottoNumber);

        //then
        assertThat(actual).isEqualTo(LottoNumber.from(lottoNumber));

    }

    @ParameterizedTest(name = "{index} [{arguments}]")
    @ValueSource(ints = {
            0, 46
    })
    @DisplayName("로또 번호 범위 외 숫자")
    void construct_exception(int lottoNumber) throws Exception {
        //when
        ThrowableAssert.ThrowingCallable actual = () -> LottoNumber.from(lottoNumber);

        //then
        assertThatThrownBy(actual).isInstanceOf(LottoNumberException.class)
                .hasMessage(String.format("로또 번호는 범위는 1 ~ 45 입니다. 현재 번호 : %d", lottoNumber));

    }


}
