package problem.step05;

import java.io.*;

public class Q10818 {

    public static final String SPACE = " ";

    public static int[] solution(int[] enter) {
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int i : enter) {
            answer[0] = Math.min(i, answer[0]);
            answer[1] = Math.max(i, answer[1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(SPACE);
            int[] enter = new int[n];
            for (int i = 0; i < n; i++) {
                enter[i] = Integer.parseInt(s[i]);
            }
            int[] solution = solution(enter);
            for (int i : solution) {
                bw.write(i + SPACE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
