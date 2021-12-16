package problem.step07;

import java.io.*;

public class Q1152 {

    public static final String CRLF = "\n";
    public static final String SPACE = " ";

    public static int solution(String enter) {
        String[] strings = enter.trim().split(SPACE);
        if (strings[0].equals("")) {
            return 0;
        }
        return strings.length;
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
