package problem.step08;

import java.io.*;

public class Q2292 {

    public static final String CRLF = "\n";

    public static int solution(int enter) {
        if (1 == enter) {
            return 1;
        }
        int answer = 1;
        int range = 1;

        while (range < enter) {
            range = range + (6 * answer);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int enter = Integer.parseInt(br.readLine());
            int solution = solution(enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
