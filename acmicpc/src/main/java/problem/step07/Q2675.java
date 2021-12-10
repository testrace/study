package problem.step07;

import java.io.*;

public class Q2675 {

    public static final String CRLF = "\n";
    private static final StringBuilder BUILDER = new StringBuilder();
    public static final String SPACE = " ";

    public static String[] solution(int n, String[] enter) {
        String[] answer = new String[n];

        for (int i = 0; i < enter.length; i++) {
            BUILDER.setLength(0);
            String[] split = enter[i].split(SPACE);
            int cnt = Integer.parseInt(split[0]);

            for (int j = 0; j < split[1].length(); j++) {
                BUILDER.append(String.valueOf(split[1].charAt(j)).repeat(Math.max(0, cnt)));
            }
            answer[i] = BUILDER.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            String[] enter = new String[n];
            for (int i = 0; i < enter.length; i++) {
                enter[i] = br.readLine();
            }
            String[] solution = solution(n, enter);
            for (String s : solution) {
                bw.write(s + CRLF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
