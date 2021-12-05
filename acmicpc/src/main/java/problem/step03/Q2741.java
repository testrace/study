package problem.step03;

import java.io.*;

public class Q2741 {

    public static final String CRLF = "\n";

    public static int[] solution(int x) {
        int[] answer = new int[x];

        for (int i = 1; i <= x; i++) {
            answer[i-1] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int first = Integer.parseInt(bufferedReader.readLine());
            int[] solution = solution(first);
            for (int i : solution) {
                bufferedWriter.write(i + CRLF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
