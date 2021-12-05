package problem.step04;

import java.io.*;

public class Q10951 {

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

            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                int result = plus(readLine);
                bufferedWriter.write(result + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
