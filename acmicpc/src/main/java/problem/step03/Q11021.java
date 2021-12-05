package problem.step03;

import java.io.*;

public class Q11021 {

    public static final String CRLF = "\n";
    public static final String DELIMITER = " ";

    public static int[] solution(int x, String[] enter) {
        int[] answer = new int[x];

        for (int i = 0; i < x; i++) {
            answer[i] = plus(enter[i]);
        }
        return answer;
    }

    private static int plus(String s) {
        String[] split = s.split(DELIMITER);
        return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int first = Integer.parseInt(bufferedReader.readLine());
            String[] enter = new String[first];
            for (int i = 0; i < enter.length; i++) {
                enter[i] = bufferedReader.readLine();
            }
            int[] solution = solution(first, enter);
            for (int i = 0; i < solution.length; i++) {
                bufferedWriter.write(String.format("Case #%d: %d%s", i + 1, solution[i], CRLF));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
