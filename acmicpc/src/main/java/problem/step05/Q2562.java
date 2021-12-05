package problem.step05;

import java.io.*;

public class Q2562 {

    public static final String CSRF = "\n";

    public static int[] solution(int[] enter) {
        int[] answer = new int[]{Integer.MIN_VALUE, 0};

        for (int i = 0; i < enter.length; i++) {
            int value = enter[i];
            if (value > answer[0]) {
                answer[0] = value;
                answer[1] = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int[] enter = new int[9];
            for (int i = 0; i < 9; i++) {
                enter[i] = Integer.parseInt(br.readLine());
            }
            int[] solution = solution(enter);
            for (int i : solution) {
                bw.write(i + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
