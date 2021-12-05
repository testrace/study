package problem.step04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q10952 {

    public static final String CSRF = "\n";
    public static final String SPACE = " ";

    public static int[] solution(String[] enter) {
        int[] answer = new int[enter.length];

        for (int i = 0; i < enter.length; i++) {
            answer[i] = plus(enter[i]);
        }

        return answer;
    }

    private static int plus(String enter) {
        String[] split = enter.split(SPACE);
        return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            List<String> enter = new ArrayList<>();
            String readLine;
            while (!"0 0".equals(readLine = bufferedReader.readLine())) {
                enter.add(readLine);
            }

            int[] solution = solution(enter.toArray(new String[0]));
            for (int s : solution) {
                bufferedWriter.write(s + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
