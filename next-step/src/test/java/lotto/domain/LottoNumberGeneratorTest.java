package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class LottoNumberGeneratorTest {

    @Test
    @DisplayName("로또 번호 6개 자동 생성")
    void shuffle() throws Exception {
        //when
        Set<LottoNumber> actual = LottoNumberGenerator.shuffle();

        //then
        assertThat(actual).hasSize(6);

    }

}
