package problem.step06;

import java.io.*;

public class Q1065 {

    public static final String CRLF = "\n";

    public static int solution(int n) {

        if (n < 100) {
            return n;
        }
        int answer = 99;
        for (int i = 100; i <= n; i++) {
            int third = i % 10;
            int second = (i / 10) % 10;
            int first = i / 100;

            if ((first - second) == (second - third)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int solution = solution(n);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
