package problem.step07;

import java.io.*;
import java.util.*;

public class Q1157 {

    public static final String CRLF = "\n";
    public static final String BLANK = "";

    static String answer = "";

    public static String solution(String enter) {

        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        for (String s : enter.split(BLANK)) {
            String upper = s.toUpperCase();
            int count = map.getOrDefault(upper, 0) + 1;
            map.put(upper, count);
            if (count > max) {
                max = count;
                answer = upper;
            }
        }

        return maxAnswer(map, max);
    }

    private static String maxAnswer(Map<String, Integer> map, int max) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                count++;
            }
            if (count > 1) {
                return "?";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String enter = br.readLine();
            String solution = solution(enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
