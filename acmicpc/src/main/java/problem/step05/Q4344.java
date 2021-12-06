package problem.step05;

import java.io.*;

public class Q4344 {

    public static final String CSRF = "\n";
    public static final String SPACE = " ";
    public static final String PER = "%";

    public static String[] solution(String[] enter) {
        String[] answer = new String[enter.length];

        for (int i = 0; i < enter.length; i++) {
            String[] split = enter[i].split(SPACE);
            int cnt = Integer.parseInt(split[0]);
            int sum = 0;
            for (int j = 1; j < split.length; j++) {
                sum += Integer.parseInt(split[j]);
            }

            double avg = (double)sum / cnt;
            int overCnt = 0;
            for (int j = 1; j < split.length; j++) {
                overCnt += (Integer.parseInt(split[j]) > avg) ? 1 : 0;
            }

            answer[i] = String.format("%.3f", ((double)overCnt / cnt) * 100);

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

            String[] solution = solution(enter);
            for (String i : solution) {
                bw.write(i + PER + CSRF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
