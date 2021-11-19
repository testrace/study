package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static lotto.domain.DefaultLotto.*;
import static org.assertj.core.api.Assertions.*;

class LottosTest {

    @Test
    @DisplayName("로또 여러장 생성")
    void construct() throws Exception {
        //given

        //when
        Lottos actual = generateLottos(
                generateLotto(),
                generateLotto()
        );

        //then
        assertThat(actual).isEqualTo(generateLottos(
                generateLotto(),
                generateLotto()
        ));

    }

    @ParameterizedTest(name = "{index} [{arguments}]")
    @DisplayName("로또별 당첨 수 확인")
    @MethodSource("match")
    void match(Lottos lottos, int expectedMatchCount, int expectedValue) throws Exception {
        //given
        WinningLotto winningLotto = new WinningLotto(DefaultLotto.generateLotto());

        //when
        Map<Integer, Integer> actual = lottos.matchResult(winningLotto);

        //then
        assertThat(actual).containsEntry(expectedMatchCount, expectedValue);

    }

    private static Stream<Arguments> match() {
        return Stream.of(
                Arguments.of(generateLottos(generateLotto()), 6, 1),
                Arguments.of(generateLottos(generateLotto(1, 2, 3, 4, 5, 7)), 5, 1),
                Arguments.of(generateLottos(generateLotto(1, 2, 3, 4, 7, 8)), 4, 1),
                Arguments.of(generateLottos(generateLotto(1, 2, 3, 7, 8, 9)), 3, 1),
                Arguments.of(generateLottos(generateLotto(7, 8, 9, 10, 11, 12)), 0, 1)
        );
    }

    private static Lottos generateLottos(Lotto... lottos) {
        return new Lottos(Arrays.asList(lottos));
    }


}