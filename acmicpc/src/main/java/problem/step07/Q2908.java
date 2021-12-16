package problem.step07;

import java.io.*;

public class Q2908 {

    public static final String CRLF = "\n";
    public static final String SPACE = " ";

    public static int solution(String enter) {
        String[] strings = enter.trim().split(SPACE);
        int first = swap(strings[0]);
        int second = swap(strings[1]);
        return Math.max(first, second);
    }

    private static int swap(String str) {
        int first = str.charAt(0) - '0';
        int second = str.charAt(1) - '0';
        int third = str.charAt(2) - '0';
        return (third * 100) + (second *  10) + first;
    }


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String enter = br.readLine();
            int solution = solution(enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
