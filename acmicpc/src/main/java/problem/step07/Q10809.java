package problem.step07;

import java.io.*;

public class Q10809 {

    public static final String CRLF = "\n";
    public static final String SPACE = " ";

    public static int[] solution(String s) {
        int[] answer = new int[26];

        for (int i = 97; i < 123; i++) {
            answer[i - 97] = s.indexOf((char) i);
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String enter = br.readLine();
            int[] solution = solution(enter);
            for (int i : solution) {
                bw.write(i + SPACE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
