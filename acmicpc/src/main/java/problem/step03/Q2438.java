package problem.step03;

import java.io.*;

public class Q2438 {

    public static final String CRLF = "\n";
    public static final String START = "*";

    public static String[] solution(int x) {
        String[] answer = new String[x];

        for (int i = 0; i < x; i++) {
            answer[i] = "";
            for (int j = 0; j < i + 1; j++) {
                answer[i] += START;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int first = Integer.parseInt(bufferedReader.readLine());
            String[] solution = solution(first);
            for (String s : solution) {
                bufferedWriter.write(s + CRLF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
