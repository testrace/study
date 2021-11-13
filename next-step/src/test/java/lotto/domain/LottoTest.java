package lotto.domain;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class LottoTest {

    List<LottoNumber> lottoNumbers;

    @BeforeEach
    void setUp() {
        lottoNumbers = generateLottoNumbers(1, 2, 3, 4, 5, 6);
    }

    @Test
    @DisplayName("서로 다른 6개 번호를 가진 로또")
    void construct() throws Exception {
        //when
        Lotto actual = Lotto.from(lottoNumbers);

        //then
        assertThat(actual).isEqualTo(Lotto.from(lottoNumbers));
    }

    @ParameterizedTest(name = "{index} [{arguments}]")
    @DisplayName("서로 다른 6개 번호가 아닐 경우")
    @MethodSource("lottoNumbers_exception")
    void lottoNumbers_exception(List<LottoNumber> lottoNumbers) throws Exception {
        //when
        ThrowingCallable actual = () -> Lotto.from(lottoNumbers);

        //then
        assertThatThrownBy(actual).isInstanceOf(LottoException.class)
                .hasMessage("로또는 6개의 번호로 생성 가능합니다.");
    }

    private static Stream<Arguments> lottoNumbers_exception() {
        return Stream.of(
                Arguments.of(generateLottoNumbers(1, 2, 3, 4, 5, 6, 7)),
                Arguments.of(generateLottoNumbers(1, 2, 3, 4, 5, 5)),
                Arguments.of(generateLottoNumbers(1, 2, 3, 4, 5)),
                Arguments.of(generateLottoNumbers())
        );
    }

    @ParameterizedTest(name = "{index} [{arguments}]")
    @CsvSource(value = {
            "1,true",
            "7,false"
    })
    @DisplayName("로또 번호 포함")
    void contains(int number, boolean expected) throws Exception {
        //when
        boolean actual = lottoNumbers.contains(LottoNumber.from(number));

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static List<LottoNumber> generateLottoNumbers(int... numbers) {
        return Arrays.stream(numbers)
                .mapToObj(LottoNumber::from)
                .collect(Collectors.toList());
    }

}