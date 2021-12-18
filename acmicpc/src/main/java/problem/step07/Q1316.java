package problem.step07;

import java.io.*;

public class Q1316 {

    public static final String CRLF = "\n";

    public static int solution(String[] enter) {
        int answer = enter.length;
        int[] alphabet;

        for (int i = 0; i < enter.length; i++) {
            alphabet = new int[26];
            String s = enter[i];
            char[] chars = s.toCharArray();
            int i1 = chars[0] - 97;
            alphabet[i1] = 1;
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == chars[j - 1]) {
                    continue;
                }

                if (alphabet[chars[j] - 97] == 1) {
                    answer--;
                    break;
                }
                alphabet[chars[j] - 97] = 1;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            String[] enter = new String[n];
            for (int i = 0; i < n; i++) {
                enter[i] = br.readLine();
            }
            int solution = solution(enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
