package problem.step03;

import java.io.*;

public class Q2439 {

    public static final String CRLF = "\n";
    public static final String STAR = "*";
    public static final String SPACE = " ";

    public static String[] solution(int x) {
        String[] answer = new String[x];

        for (int i = 0; i < x; i++) {
            answer[i] = "";
            for (int j = 0; j < x; j++) {
                answer[i] += symbol(x, i, j);
            }
        }
        return answer;
    }

    private static String symbol(int x, int i, int j) {
        if ((x - i -2) >= j) {
            return SPACE;
        }
        return STAR;
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
