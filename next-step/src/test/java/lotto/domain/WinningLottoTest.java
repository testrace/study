package lotto.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lotto.domain.DefaultLotto.generateLotto;
import static org.assertj.core.api.Assertions.*;

class WinningLottoTest {

    private Lotto lotto;

    @BeforeEach
    void setUp() {
        lotto = generateLotto(1, 2, 3, 4, 5, 6);
    }

    @Test
    @DisplayName("지난 주 당첨 로또 번호 생성")
    void construct() throws Exception {
        //when
        WinningLotto actual = new WinningLotto(lotto);

        //then
        assertThat(actual).isEqualTo(new WinningLotto(lotto));

    }

    @ParameterizedTest(name = "{index} [{arguments}]")
    @DisplayName("일치하는 번호 수")
    @MethodSource("matchCount")
    void match_count(Lotto ticket, int expected) throws Exception {
        //given
        WinningLotto winningLotto = new WinningLotto(lotto);

        //when
        int actual = winningLotto.matchingCount(ticket);

        //then
        assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> matchCount() {
        return Stream.of(
                Arguments.of(generateLotto(1, 2, 3, 4, 5, 6), 6),
                Arguments.of(generateLotto(1, 2, 3, 4, 5, 7), 5),
                Arguments.of(generateLotto(1, 2, 3, 4, 7, 8), 4),
                Arguments.of(generateLotto(1, 2, 3, 7, 8, 9), 3),
                Arguments.of(generateLotto(7, 8, 9, 10, 11, 12), 0)
        );
    }


}