package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LottoResultTest {

    @ParameterizedTest(name = "{index} [{arguments}]")
    @DisplayName("로또번호 당첨 일치 수에 따른 등수")
    @MethodSource("match")
    void match(int matchCount, LottoResult expected) throws Exception {
        //when
        LottoResult actual = LottoResult.match(matchCount);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> match() {
        return Stream.of(
                Arguments.of(0, LottoResult.ZERO),
                Arguments.of(3, LottoResult.FOURTH),
                Arguments.of(4, LottoResult.THIRD),
                Arguments.of(5, LottoResult.SECOND),
                Arguments.of(6, LottoResult.FIRST)
        );
    }

}
