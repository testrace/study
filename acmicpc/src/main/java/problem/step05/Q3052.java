package problem.step05;

import java.io.*;

public class Q3052 {

    public static final String CSRF = "\n";

    public static int solution(int[] enter) {
        int answer = 0;
        int[] arr = new int[42];

        for (int i : enter) {
            arr[i % 42]++;
        }

        for (int i : arr) {
            if (i > 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int[] enter = new int[10];
            for (int i = 0; i < 10; i++) {
                enter[i] = Integer.parseInt(br.readLine());
            }
            int solution = solution(enter);
            bw.write(solution + CSRF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
