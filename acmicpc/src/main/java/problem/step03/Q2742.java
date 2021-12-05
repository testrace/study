package problem.step03;

import java.io.*;

public class Q2742 {

    public static final String CRLF = "\n";

    public static int[] solution(int x) {
        int[] answer = new int[x];

        for (int i = x; i >= 1; i--) {
            answer[x-i] = i;
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
