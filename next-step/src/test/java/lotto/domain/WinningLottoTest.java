package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

class WinningLottoTest {

    @Test
    @DisplayName("지난 주 당첨 로또 번호 생성")
    void construct() throws Exception {
        //given
        Lotto lotto = generateLotto(1, 2, 3, 4, 5, 6);

        //when
        WinningLotto winningLotto = new WinningLotto(lotto);

        //then
        assertThat(winningLotto).isEqualTo(new WinningLotto(lotto));

    }

    private static Lotto generateLotto(int... numbers) {
        return Arrays.stream(numbers)
                .mapToObj(LottoNumber::from)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Lotto::from));
    }

}