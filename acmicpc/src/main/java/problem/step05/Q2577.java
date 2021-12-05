package problem.step05;

import java.io.*;

public class Q2577 {

    public static final String CSRF = "\n";

    public static int[] solution(int n) {
        int[] answer = new int[10];

        String s = String.valueOf(n);
        String[] split = s.split("");
        for (String str : split) {
            int num = Integer.parseInt(str);
            answer[num]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = 1;
            for (int i = 0; i < 3; i++) {
                n = n * Integer.parseInt(br.readLine());
            }
            int[] solution = solution(n);
            for (int i : solution) {
                bw.write(i + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
