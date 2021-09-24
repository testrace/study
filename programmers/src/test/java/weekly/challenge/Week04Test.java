package weekly.challenge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week04Test {

    @ParameterizedTest
    @MethodSource("test")
    void test(String[] table, String[] lang, int[] pref, String expected) throws Exception {
        //given
        Week04 week = new Week04();

        //when
        String solution = week.solution(table, lang, pref);

        //then
        assertThat(solution).isEqualTo(expected);

    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(table(), new String[]{"PYTHON", "C++", "SQL"}, new int[]{7, 5, 5}, "HARDWARE"),
                Arguments.of(table(), new String[]{"JAVA", "JAVASCRIPT"}, new int[]{7, 5}, "PORTAL")
        );
    }

    private static String[] table() {
        return new String[]{
                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };
    }

}