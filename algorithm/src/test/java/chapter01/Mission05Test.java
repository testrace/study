package chapter01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Mission05Test {

    @ParameterizedTest
    @CsvSource(value = {
            "a#b!GE*T@S, S#T!EG*b@a",
            "kdj#@kdjg%$#kdjgk@kd$dk, kdd#@kkgj%$#dkgjd@kj$dk",
            "kqQdj#@kd#g%$#kdj&&gk@kd$dQGk, kGQdd#@kk#g%$#jdk&&gd@kj$dQqk",
            "kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk, kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk",
            "kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#, kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#"
    })
    void test(String enter, String expected) throws Exception {
        //given
        Mission05 mission05 = new Mission05();

        //when
        String actual = mission05.solution(enter);

        //then
        assertThat(actual).isEqualTo(expected);

    }
    //kdj#@ kdjg%$ # kdjgk@ kd$dk
    //kdj#@ kkgj%$ # kdgjd@ kd$dk
    //kdd#@ kkgj%$ # dkgjd@ kj$dk
}