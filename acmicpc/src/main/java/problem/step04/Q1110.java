package problem.step04;

import java.io.*;

public class Q1110 {

    public static int solution(int n) {
        int answer = 0;
        int tmp = n;
        do {
            int left = tmp / 10;
            int right = tmp % 10;
            tmp = (right * 10) + ((left + right) % 10);
            answer++;
        } while (tmp != n);

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int solution = solution(n);
            bw.write(solution + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
