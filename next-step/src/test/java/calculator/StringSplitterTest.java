package calculator;

import calculator.Numbers;
import calculator.StringSplitter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringSplitterTest {

    private static final Numbers NUMBERS = Numbers.from(new String[]{"1", "2", "3"});

    @ParameterizedTest(name = "{index} [{arguments}]")
    @DisplayName("구분자에 따른 문자 분리")
    @ValueSource(strings = {
            "1,2:3", "//;\n1;2;3"
    })
    void split(String input) {
        //when
        Numbers actual = StringSplitter.split(input);

        //then
        assertThat(actual).isEqualTo(NUMBERS);
    }

}
