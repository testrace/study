package problem.step05;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Q1546 {

    public static final String CSRF = "\n";
    public static final String SPACE = " ";

    public static double solution(String enter) {
        String[] enters = enter.split(SPACE);

        double max = getIntStream(enters)
                .max()
                .orElse(0);

        double avg = getIntStream(enters)
                .average()
                .orElse(0);

        return avg / max * 100;

    }

    private static IntStream getIntStream(String[] enters) {
        return Arrays.stream(enters)
                .mapToInt(Integer::parseInt);
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            String enter = br.readLine();

            double solution = solution(enter);
            bw.write(solution + CSRF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
