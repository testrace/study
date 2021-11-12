package calculator;

import calculator.StringNumber;
import calculator.StringNumberException;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringNumberTest {

    @Test
    @DisplayName("생성자")
    void construct() throws Exception {
        //given
        String number = "1";

        //when
        StringNumber actual = StringNumber.valueOf(number);

        //then
        assertThat(actual).isEqualTo(StringNumber.valueOf(number));

    }

    @ParameterizedTest(name = "생성자 예외 {index} [{arguments}]")
    @DisplayName("객체 생성 예외")
    @ValueSource(strings = {"-1", "one"})
    void construct_exception(String stringNumber) throws Exception {
        //when
        ThrowableAssert.ThrowingCallable actual = () -> StringNumber.valueOf(stringNumber);

        //then
        assertThatThrownBy(actual).isInstanceOf(StringNumberException.class)
                .hasMessage("0 이상의 숫자만 입력 가능합니다.");

    }

    @ParameterizedTest(name = "생성자 null empty 예외 {index} [{arguments}]")
    @DisplayName("null 또는 empty 로 객체 생성 예외")
    @NullAndEmptySource
    void construct_exception_null_and_empty(String stringNumber) throws Exception {
        construct_exception(stringNumber);
    }
}