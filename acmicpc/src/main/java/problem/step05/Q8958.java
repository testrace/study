package problem.step05;

import java.io.*;

public class Q8958 {

    public static final String CSRF = "\n";
    public static final String BLANK = "";
    public static final String O = "O";

    public static int[] solution(String[] enter) {
        int[] answer = new int[enter.length];

        for (int i = 0; i < enter.length; i++) {
            String s = enter[i];
            String[] oxs = s.split(BLANK);
            int cnt = 0;
            for (String ox : oxs) {
                if (ox.equals(O)) {
                    cnt++;
                    answer[i] += cnt;
                } else {
                    cnt = 0;
                }
            }
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

            int[] solution = solution(enter);
            for (int i : solution) {
                bw.write(i + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
