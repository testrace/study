package problem.step07;

import java.io.*;

public class Q11720 {

    public static final String CRLF = "\n";

    public static int solution(int n, String s) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += s.charAt(i) - 48;
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            Integer n = Integer.parseInt(br.readLine());
            String enter = br.readLine();
            int solution = solution(n, enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
